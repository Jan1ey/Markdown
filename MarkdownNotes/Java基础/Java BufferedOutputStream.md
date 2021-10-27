# BufferedOutputStream字节缓冲输出流

## 构造方式

* public BufferedOutputStream(OutputStream out):
> 采用的默认的缓冲区大小,来构造一个字节缓冲输出流对象

* public BufferedOutputStream(OutputStream out,int size):
> 指定size缓冲区大小构造缓冲输出流对象
***

## 常用方法
* public void write(int b)throws IOException
> 一次写一个字节

* public void write(byte[] b,int off,int len) throws IOException
> 一次写一个字节数组的一部分
 
* public void flush() throws IOException
> 刷新此缓冲的输出流。这迫使所有缓冲的输出字节被写出到底层输出流中。

* public void close() throws IOException
> 关闭此输出流并释放与此流有关的所有系统资源。FilterOutputStream 的 close 方法先调用其 flush 方法，然后调用其基础输出流的 close 方法。