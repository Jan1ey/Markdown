# Class StringBuffer

* 继承类
> java.lang.Object
> >	java.lang.StringBuffer

* 实现的所有接口
> Serializable ， Appendable ， CharSequence ， Comparable<StringBuffer>

* 声明: 
> `public final class StringBuffer
extends Object
implements Serializable, Comparable<StringBuffer>, CharSequence`

* 线程安全，可变的字符序列。 字符串缓冲区类似于String ，但可以进行修改。 在任何时间点它都包含一些特定的字符序列，但序列的长度和内容可以通过某些方法调用来改变。

* 字符串缓冲区可供多个线程使用。 这些方法在必要时进行同步，以便任何特定实例上的所有操作都表现得好像它们以某个串行顺序出现，这与所涉及的每个单独线程所进行的方法调用的顺序一致。

* StringBuffer上的主要操作是append和insert方法，它们被重载以接受任何类型的数据。 每个都有效地将给定的数据转换为字符串，然后将该字符串的字符追加或插入字符串缓冲区。 append方法总是在缓冲区的末尾添加这些字符; insert方法在指定点添加字符。

* 例如，如果z引用其当前内容为"start"的字符串缓冲区对象，则方法调用z.append("le")将导致字符串缓冲区包含"startle" ，而z.insert(4, "le")将更改字符串缓冲区以包含"starlet" 。

* 一般情况下，如果某人是指的一个实例StringBuffer ，然后sb.append(x)具有相同的效果sb.insert(sb.length(), x) 。

* 每当涉及源序列的操作发生时（例如从源序列追加或插入），此类仅在执行操作的字符串缓冲区上同步，而不在源上同步。 请注意，虽然StringBuffer设计为可以安全地从多个线程同时使用，但如果构造函数或append或insert操作传递了跨线程共享的源序列，则调用代码必须确保操作具有一致且不变的视图操作持续时间的源序列。 这可以通过在操作调用期间持有锁的调用者，通过使用不可变的源序列，或者不跨线程共享源序列来满足。

* 每个字符串缓冲区都有容量。 只要字符串缓冲区中包含的字符序列的长度不超过容量，就不必分配新的内部缓冲区数组。 如果内部缓冲区溢出，它会自动变大。

* 除非另有说明，否则将null参数传递给null中的构造函数或方法将导致抛出NullPointerException 。

* 从JDK 5版本开始，这个类已经补充了一个设计用于单个线程的等效类， StringBuilder 。 通常应优先使用StringBuilder类，因为它支持所有相同的操作，但速度更快，因为它不执行同步。

* API Note:
StringBuffer实现Comparable但不覆盖equals 。 因此， StringBuffer的自然顺序与equals不一致。 如果StringBuffer对象用作StringBuffer中的键或SortedMap元素， SortedSet 。 见Comparable ， SortedMap ，或SortedSet获取更多信息。
* 从以下版本开始：
1.0
* 另请参见：
StringBuilder ， String ， Serialized Form
*** 

## 构造方法

* StringBuffer()	
> 构造一个字符串缓冲区，其中没有字符，初始容量为16个字符。
* StringBuffer​(int capacity)	
> 构造一个字符串缓冲区，其中没有字符和指定的初始容量。
* StringBuffer​(CharSequence seq)	
> 构造一个字符串缓冲区，其中包含与指定的 CharSequence相同的字符。
* StringBuffer​(String str* )	
> 构造一个初始化为指定字符串内容的字符串缓冲区。
***

## 常用方法

* StringBuffer	append​(boolean b)	
> 将 boolean参数的字符串表示形式追加到序列中。
* StringBuffer	append​(char c)	
> 将 char参数的字符串表示形式追加到此序列。
* StringBuffer	append​(char[] str)	
> 将 char数组参数的字符串表示形式追加到此序列。
* StringBuffer	append​(char[] str, int offset, int len)	
> 将 char数组参数的子数组的字符串表示形式追加到此序列。
* StringBuffer	append​(double d)	
> 将 double参数的字符串表示形式追加到此序列。
* StringBuffer	append​(float f)	
> 将 float参数的字符串表示形式追加到此序列。
* StringBuffer	append​(int i)	
> 将 int参数的字符串表示形式追加到此序列。
* StringBuffer	append​(long lng)	
> 将 long参数的字符串表示形式追加到此序列。
* StringBuffer	append​(CharSequence s)	
> 将指定的 CharSequence追加到此序列。
* StringBuffer	append​(CharSequence s, int start, int end)	
> 将指定的 CharSequence序列附加到此序列。
* StringBuffer	append​(Object obj)	
> 追加 Object参数的字符串表示形式。
* StringBuffer	append​(String str)	
> 将指定的字符串追加到此字符序列。
* StringBuffer	append​(StringBuffer sb)	
> 将指定的 StringBuffer追加到此序列。
* StringBuffer	appendCodePoint​(int codePoint)	
> 将 codePoint参数的字符串表示形式追加到此序列。
* int	capacity()	
> 返回当前容量。
* char	charAt​(int index)	
> 返回指定索引处的此序列中的 char值。
* IntStream	chars()	
> 返回 int的流，对此序列中的 char值进行零扩展。
* int	codePointAt​(int index)	
> 返回指定索引处的字符（Unicode代码点）。
* int	codePointBefore​(int index)	
> 返回指定索引之前的字符（Unicode代码点）。
* int	codePointCount​(int beginIndex, int endIndex)	
> 返回此序列的指定文本范围内的Unicode代码点数。
* IntStream	codePoints()	
> 返回此序列中的代码点值流。
* int	compareTo​(StringBuffer another)	
> StringBuffer字典顺序比较两个 StringBuffer实例。
* StringBuffer	delete​(int start, int end)	
> 删除此序列的子字符串中的字符。
* StringBuffer	deleteCharAt​(int index)	
> 按此顺序删除指定位置的 char 。
* void	ensureCapacity​(int minimumCapacity)	
> 确保容量至少等于指定的最小值。
* void	getChars​(int srcBegin, int srcEnd, char[] dst, int dstBegin)	
> 将字符从此序列复制到目标字符数组 dst 。
* int	indexOf​(String str)	
> 返回指定子字符串第一次出现的字符串中的索引。
* int	indexOf​(String str, int fromIndex)	
> 从指定的索引处开始，返回指定子字符串第一次出现的字符串中的索引。
* StringBuffer	insert​(int offset, boolean b)	
> 将 boolean参数的字符串表示形式插入此序列中。
* StringBuffer	insert​(int offset, char c)	
> 将 char参数的字符串表示形式插入此序列中。
* StringBuffer	insert​(int offset, char[] str)	
> 将 char数组参数的字符串表示形式插入此序列中。
* StringBuffer	insert​(int index, char[] str, int offset, int len)	
> 将 str数组参数的子数组的字符串表示形式插入此序列中。
* StringBuffer	insert​(int offset, double d)	
> 将 double参数的字符串表示形式插入此序列中。
* StringBuffer	insert​(int offset, float f)	
> 将 float参数的字符串表示形式插入此序列中。
* StringBuffer	insert​(int offset, int i)	
> 将第二个 int参数的字符串表示形式插入到此序列中。
* StringBuffer	insert​(int offset, long l)	
> 将 long参数的字符串表示形式插入此序列中。
* StringBuffer	insert​(int dstOffset, CharSequence s)	
> 将指定的 CharSequence插入此序列。
* StringBuffer	insert​(int dstOffset, CharSequence s, int start, int end)	
> 将指定的 CharSequence序列插入此序列。
* StringBuffer	insert​(int offset, Object obj)	
> 将 Object参数的字符串表示形式插入此字符序列。
* StringBuffer	insert​(int offset, String str)	
> 将字符串插入此字符序列。
* int	lastIndexOf​(String str)	
> 返回指定子字符串最后一次出现的字符串中的索引。
* int	lastIndexOf​(String str, int fromIndex)	
> 返回指定子字符串最后一次出现的字符串中的索引，从指定索引开始向后搜索。
* int	offsetByCodePoints​(int index, int codePointOffset)	
> 返回此序列中的索引，该索引从给定的 index偏移 codePointOffset代码点。
* StringBuffer	replace​(int start, int end, String str)	
> 使用指定的 String的字符替换此序列的子字符串中的字符。
* StringBuffer	reverse()	
> 导致此字符序列被序列的反向替换。
* void	setCharAt​(int index, char ch)	
> 指定索引处的字符设置为 ch 。
* void	setLength​(int newLength)	
> 设置字符序列的长度。
* CharSequence	subSequence​(int start, int end)	
> 返回一个新的字符序列，它是该序列的子序列。
* String	substring​(int start)	
> 返回一个新的 String ，其中包含此字符序列中当前包含的字符的子序列。
* String	substring​(int start, int end)	
> 返回一个新的 String ，其中包含当前包含在此序列中的字符的子序列。
* void	trimToSize()	
> 尝试减少用于字符序列的存储空间。