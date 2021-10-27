# Java OutputStreamWriter

* 将一个字节的输入流转换为字符的输入流
***

##构造方法

* public OutputStreamWriter(FileoutStream out)
> 使用系统默认的字符集构造输出流对象

* * public OutputStreamWriter(FileoutStream out, String charsetName)
> 使用charsetName指定的字符集构造输出流对象
***

##常用方法

* public void write(int b)throws IOException
> 一次写一个字节

* public void write(byte[] b,int off,int len) throws IOException
> 一次写一个字节数组的一部分
 
* public void flush() throws IOException
> 刷新此缓冲的输出流。这迫使所有缓冲的输出字节被写出到底层输出流中。

* public void close() throws IOException
> 关闭此输出流并释放与此流有关的所有系统资源。FilterOutputStream 的 close 方法先调用其 flush 方法，然后调用其基础输出流的 close 方法。