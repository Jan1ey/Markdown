#BufferedInputStream字节缓冲输入流

##构造方法
* public BufferedInputStream(InputStream in):
> 默认缓冲区大小构造缓冲输入流对象

* public BufferedInputStream(InputStream in,int size):
> 指定缓冲区大小构造缓冲输入流对象
***

##常用方法

* public int read()
> 一次读写一个字节。下一个数据字节，如果到达流末尾，则返回 -1。

* public int read(byte[] b,int off,int len)
> 一次读取一个字节数组

* public void close() throws IOException
> 关闭此输入流并释放与该流关联的所有系统资源。