# Comparable

- Arrays 类中的 sort 方法可以对实现了 Comparable 接口的类进行排序

- 下面是 Comparable 接口的代码: 

```java
	public interface Comparable<T>
	{
		int compareTo(T other);
	}
```
> 这说明任何实现 Comparable 接口的类都需要包含 compareTo 方法，并且这个方法的参数必须时一个 Object 对象，返回一个整型数值

- 在调用 X.compareTo(y) 的时候，这个 compareTo 方法必须确实比较两个对象的内容，并返回比较的结果。当 x 小于 y 时，返回一个负数；当 x 等于 y 时，返回 0;否则返回一个正数

# Comparator

- Arrays.Sort 方法还有第二个版本，有一个数组和一个比较器( comparator)作为参数，比较器是实现了 Comparator 接口的类的实例

```java
	public interface Comparator<T>
	{
		int compare(T first, T second);
	}
```

- 要按照长度比较字符串，可以如下定义一个实现 Comparator<String> 的类：

```java
	class lengthComparator implements Comparable<String>
	{
		public int compare(String first, String second) {
			return first.length() - second.length();
		}
	}
```

- 具体进行比较时，需要建立一个实例：

```java
	Comparator<String> comparator = new lengthComparator();
	if(comparator.compare(words[i], words[j]) > 0) ....
```

- 要对一个数组进行排序，需要为 Arrays.sort() 方法传入一个 lengthComparator 对象：

```java
	String friends = {"Peter", "Paul", "Mary"};
	Arrays.sort(friends, lengthComparator());
```