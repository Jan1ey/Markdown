# JDBC

## 建立 MySQL 数据库连接

* 方式一：

```java
	//方式一：
    @Test
    public void testConnection() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();

        String url = "jdbc:mysql://localhost:3306/test";
        Properties info = new Properties();

        info.setProperty("user", "root");
        info.setProperty("password", "le010406");

        Connection connection = driver.connect(url, info);

        System.out.println(connection);
    }
```

* 方式二：

```java
	//方式二：不出现第三方API，程序具有更好的可移植性‘
    @Test
    public void testConnection2() throws Exception {
        //使用反射获取Driver实现类对象
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        //提供要连接的数据库信息
        String url = "jdbc:mysql://localhost:3306/test";

        //提供数据库的用户名和密码
        Properties info = new Properties();

        info.setProperty("user", "root");
        info.setProperty("password", "le010406");

        Connection connect = driver.connect(url, info);
        System.out.println(connect);
    }
```

* 方式三：

```java
//方式三：使用 DriverManager 替换 Driver
    @Test
    public  void testConnection3() throws Exception {
        //获取driver
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        //提供要连接的数据库信息
        String url = "jdbc:mysql://localhost:3306/test";

        //提供数据库的用户名和密码
        Properties info = new Properties();

        info.setProperty("user", "root");
        info.setProperty("password", "le010406");

        //注册驱动
        DriverManager.registerDriver(driver);

        //获取连接
        Connection connection = DriverManager.getConnection(url, info);
        System.out.println(connection);
    }
```

* 方式四：

```java
//方式四：只加载驱动，不用显式注册驱动
    @Test
    public void testConnection4() throws Exception {
        //提供要连接的数据库信息
        String url = "jdbc:mysql://localhost:3306/test";

        //提供数据库的用户名和密码
        Properties info = new Properties();

        info.setProperty("user", "root");
        info.setProperty("password", "le010406");

        //获取driver
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        Connection connection = DriverManager.getConnection(url, info);
        System.out.println(connection);
    }
```

* 方式五：

> 实现了数据和代码的分析，实现了解耦
> 修改配置文件信息时可以避免程序重新打包

```java
//方式五：将数据库需要的基本信息声明在配置文件中，通过读取配置文件的方式获取连接
    @Test
    public void testConnection5() throws Exception {
        //读取配置文件
        InputStream resourceAsStream = connectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties properties = new Properties();
        properties.load(resourceAsStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");

        //加载驱动
        Class.forName(driverClass);

        //建立连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
```

***

## PreparedStatement操作数据库

### 增删改查

* 增删改

```java
	public static void update(String sql, Object ...args) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //获取连接
            connection = JDBCUtils.getConnection();

            //预编译sql语句
            preparedStatement = connection.prepareStatement(sql);

            //填充占位符
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1, args[i]);
            }

            //执行操作
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.closeResources(connection, preparedStatement);
        }
    }
```

* 查

```java
	public static <T> List<T> getQueryList(Class<T> clazz, String sql, Object ...args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1, args[i]);
            }

            //执行并返回结果集
            resultSet = preparedStatement.executeQuery();

            //获取结果集的元数据
            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();

            //处理结果集
            ArrayList<T> ts = new ArrayList<>();
            while (resultSet.next()) {
                T t = clazz.newInstance();

                for (int i = 0; i < columnCount; i++) {
                    Object object = resultSet.getObject(i + 1);

                    //获取每个表的列名
                    String columnName = metaData.getColumnLabel(i + 1);

                    //给customer对象指定的columnName属性，通过反射赋值
                    Field declaredField = clazz.getDeclaredField(columnName);
                    declaredField.setAccessible(true);
                    declaredField.set(t, object);
                }
                ts.add(t);
            }
            return ts;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(connection, preparedStatement, resultSet);
        }
        return null;
    }
```

### 使用Statement操作数据表的弊端

* 通过调用 Connection 对象的 createStatement() 方法创建该对象。该对象用于执行静态的 SQL 语句，并且返回执行结果。

* 但是使用Statement操作数据表存在弊端：

>- **问题一：存在拼串操作，繁琐**
>- **问题二：存在SQL注入问题**

### Java与SQL对应数据类型转换表

| Java类型           | SQL类型                  |
| ------------------ | ------------------------ |
| boolean            | BIT                      |
| byte               | TINYINT                  |
| short              | SMALLINT                 |
| int                | INTEGER                  |
| long               | BIGINT                   |
| String             | CHAR,VARCHAR,LONGVARCHAR |
| byte   array       | BINARY  ,    VAR BINARY  |
| java.sql.Date      | DATE                     |
| java.sql.Time      | TIME                     |
| java.sql.Timestamp | TIMESTAMP                |

### ResultSetMetaData

* **问题1：得到结果集后, 如何知道该结果集中有哪些列 ？ 列名是什么？**

> 需要使用一个描述 ResultSet 的对象， 即 ResultSetMetaData

* **问题2：关于ResultSetMetaData**

> 1. **如何获取 ResultSetMetaData**： 调用 ResultSet 的 getMetaData() 方法即可
> 2. **获取 ResultSet 中有多少列**：调用 ResultSetMetaData 的 getColumnCount() 方法
> 3. **获取 ResultSet 每一列的列的别名是什么**：调用 ResultSetMetaData 的getColumnLabel() 方法

### JDBC API小结

- 两种思想
  - 面向接口编程的思想

  - ORM思想(object relational mapping)
    - 一个数据表对应一个java类
    - 表中的一条记录对应java类的一个对象
    - 表中的一个字段对应java类的一个属性

  > sql是需要结合列名和表的属性名来写。注意起别名。

- 两种技术
  - JDBC结果集的元数据：ResultSetMetaData
    - 获取列数：getColumnCount()
    - 获取列的别名：getColumnLabel()
  - 通过反射，创建指定类的对象，获取指定的属性并赋值