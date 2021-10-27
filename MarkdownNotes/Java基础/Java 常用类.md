#Java 常用类

##String

###String
	·String声明为final，不可被继承
	·String实现了serializable接口: 表示字符串是支持序列化的
	·String实现了Comparable接口: 表示String可以比较大小
	·String内部定义了final char[] value用于存储字符串数据
	·String代表不可变的字符序列，简称不可变性
		·体现: 当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值
	·通过字面量的方式(区别于new)给一个字符串赋值，此时的字符串声明在字符串常量池中
	·字符串常量池中是不会存储相同内容的字符串的

###String的实例化方式

	·1.方式一: 通过字面量定义的方式
	·2.方式二: 通过new + 构造器的方式

###结论

	·1.常量与常量的拼接结果在常量池中，且常量池中不会存在相同内容的常量
	·2.只要其中有一个是变量，结果就在堆中
	·3.如果拼接的结果调用intern()方法，返回值就在常量池中

##StringBuffer
	
	·1.可变的字符序列，线程安全的，效率低; 底层使用char[]存储
	·2.扩容问题: 默认情况下扩容为原来的容量的2倍+2，同时将原有数组的元素复制到新的数组中

##日期和时间的API

	JDK 8之前的日期和时间API
		·1.System类中的currentTimeMillis(): 返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
		·2.java.util.Date类: 
			·1.两个构造器的使用:
				·构造器一: Date(): 创建一个对应当前时间的Date对象
				·构造器二: 创建指定毫秒数的Date对象
			·2.两个方法的使用: 
				·toString(): 显示当前的年月日时分秒
				·getTime(): 获取当前Date对象的毫秒数(时间戳)
		·3.Java.sql.Date
			·sql.Date -> util.Date: 
```java
			{
				Date date1 = new Date();
				java.sql.Date date2 = new java.sql.Date(date1.getTime())
			}				
```
				
		·4.Java.text.SimpleDateFormat类
			·对日期Date类的格式化和解析
				·格式化:日期 ---> 字符串
				·解析: 字符串 ---> 日期 
			·实例化: 
```java
{
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

	//格式化: 日期 -----> 字符串
	Date date = new Date();

	String format = simpleDateFormat.format(date);

	//解析: 格式化的逆过程 字符串 ----> 日期
	String str = "19-12-18 上午11:42"

	Date date = simpleDateFormat.parse(str);  
}
```

##Java比较器

	·重写CompareTo():
	·重写Comparator():
	·两者对比: comparable接口的方式一旦确定，保证Comparable接口实现类的对象在任何位置都可以比较
		Comparetor接口属于临时性的比较

##枚举类

	·类的对象只有有限个，确定的
	·当需要定义一组常量时，建议使用枚举类
	·如果枚举类中只有一个对象时，利益作为单例模式的实现方式
	