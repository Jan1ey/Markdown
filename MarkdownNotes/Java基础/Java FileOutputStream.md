#FileOutputStream

* 该类用来创建一个文件并向文件中写数据。如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。
***

##构造方法

* 使用字符串类型的文件名来创建一个输出流对象：
> `OutputStream f = new FileOutputStream("C:/java/hello")`

* 也可以使用一个文件对象来创建一个输出流来写文件。我们首先得使用File()方法来创建一个文件对象：
> `File f = new File("C:/java/hello"); OutputStream fOut = new FileOutputStream(f);`
***

##常用方法

* 1.public void close() throws IOException{}
> 关闭此文件输入流并释放与此流有关的所有系统资源。抛出IOException异常。

* 2.protected void finalize()throws IOException {}
> 这个方法清除与该文件的连接。确保在不再引用文件输入流时调用其 close 方法。抛出IOException异常。

* 3.public void write(int w)throws IOException{}
> 这个方法把指定的字节写到输出流中。

* 4.public void write(byte[] w)
> 把指定数组中w.length长度的字节写到OutputStream中。