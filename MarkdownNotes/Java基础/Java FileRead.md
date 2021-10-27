#Java FileReader类

* FileReader类从InputStreamReader类继承而来。该类按字符读取流中数据。可以通过以下几种构造方法创建需要的对象。
***

##构造方法

* FileReader(File file)
> 在给定从中读取数据的 File 的情况下创建一个新 FileReader。

* FileReader(FileDescriptor fd)
> 在给定从中读取数据的 FileDescriptor 的情况下创建一个新 FileReader。

* FileReader(String fileName) 
> 在给定从中读取数据的文件名的情况下创建一个新 FileReader。
***

##常用方法

* 1.public int read() throws IOException
> 读取单个字符，返回一个int型变量代表读取到的字符
* 2.public int read(char [] c, int offset, int len)
> 读取字符到c数组，返回读取到字符的个数