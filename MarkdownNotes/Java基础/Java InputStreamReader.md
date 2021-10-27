# Java InputStreamReader

* 将一个字节的输入流转换为字符的输入流
***

##构造方法

* public InputStreamReader(FileInputStream in)
> 使用系统默认的字符集构造输入流对象

* * public InputStreamReader(FileInputStream in, String charsetName)
> 使用charsetName指定的字符集构造输入流对象
***

##常用方法

* public int read()
> 一次读写一个。下一个数据字节，如果到达流末尾，则返回 -1。

* public int read(byte[] b,int off,int len)
> 一次读取一个字节数组

* public void close() throws IOException
> 关闭此输入流并释放与该流关联的所有系统资源。