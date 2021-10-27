#FileInputStream

* 该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
***

##构造方法

> 1.可以使用字符串类型的文件名来创建一个输入流对象来读取文件：`InputStream f = new FileInputStream("C:/java/hello");`

> 2.也可以使用一个文件对象来创建一个输入流对象来读取文件。我们首先得使用 File() 方法来创建一个文件对象：`File f = new File("C:/java/hello");
InputStream in = new FileInputStream(f);`
***

##常用方法

* 创建了InputStream对象，就可以使用下面的方法来读取流或者进行其他的流操作。

* 1.public void close() throws IOException{}
> 关闭此文件输入流并释放与此流有关的所有系统资源。抛出IOException异常。
* 2.protected void finalize()throws IOException {}
> 这个方法清除与该文件的连接。确保在不再引用文件输入流时调用其 close 方法。抛出IOException异常。
* 3.public int read(int r)throws IOException{}
> 这个方法从 InputStream 对象读取指定字节的数据。返回为整数值。返回下一字节数据，如果已经到结尾则返回-1。
* 4.public int read(byte[] r) throws IOException{}
> 这个方法从输入流读取r.length长度的字节。返回读取的字节数。如果是文件结尾则返回-1。
* 5.public int available() throws IOException{}
> 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取的字节数。返回一个整数值。