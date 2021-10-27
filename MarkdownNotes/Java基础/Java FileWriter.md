#Java FileWriter类

* FileWriter 类从 OutputStreamWriter 类继承而来。该类按字符向流中写入数据。
***

##构造方法

* FileWriter(File file)
> 在给出 File 对象的情况下构造一个 FileWriter 对象。

* FileWriter(File file, boolean append)
> 在给出 File 对象的情况下构造一个 FileWriter 对象。

* FileWriter(FileDescriptor fd)
> 构造与某个文件描述符相关联的 FileWriter 对象。

* FileWriter(String fileName, boolean append)
> 在给出文件名的情况下构造 FileWriter 对象，它具有指示是否挂起写入数据的 boolean 值。

* 参数：

> file：要写入数据的 File 对象。
> append：如果 append 参数为 true，则将字节写入文件末尾处，相当于追加信息。如果 append 参数为 false, 则写入文件开始处。

***

##常用方法

* 1.public void write(int c) throws IOException
> 写入单个字符c。

* 2.public void write(char [] c, int offset, int len)
> 写入字符数组中开始为offset长度为len的某一部分。

* 3.public void write(String s, int offset, int len)
> 写入字符串中开始为offset长度为len的某一部分。