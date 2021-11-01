Class ArrayList<E>
>- java.lang.Object
> >- java.util.AbstractCollection<E>
> > >- java.util.AbstractList<E>
> > > >- java.util.ArrayList<E>

* 参数类型
> E - 此列表中的元素类型

* 实现的所有接口
> Serializable ， Cloneable ， Iterable<E> ， Collection<E> ， List<E> ， RandomAccess

* 已知直接子类：
AttributeList ， RoleList ， RoleUnresolvedList

* public class ArrayList<E>
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, Serializable
List接口的可调整大小的阵列实现。 实现所有可选列表操作，并允许所有元素，包括null 。 除了实现List接口之外，此类还提供了一些方法来操作内部用于存储列表的数组的大小。 （这个类大致相当于Vector ，除了它是不同步的。）
该size ， isEmpty ， get ， set ， iterator和listIterator操作在固定时间内运行。 add操作以分摊的常量时间运行，即添加n个元素需要O（n）时间。 所有其他操作都以线性时间运行（粗略地说）。 与LinkedList实施相比，常数因子较低。

* 每个ArrayList实例都有一个容量 。 容量是用于存储列表中元素的数组的大小。 它始终至少与列表大小一样大。 随着元素添加到ArrayList，其容量会自动增加。 除了添加元素具有恒定的摊销时间成本这一事实之外，未指定增长策略的详细信息。

* 在使用ensureCapacity操作添加大量元素之前，应用程序可以增加ArrayList实例的容量。 这可能会减少增量重新分配的数量。

* List list = Collections.synchronizedList(new ArrayList(...)); 
此类的iterator和listIterator方法返回的迭代器是快速失败的 ：如果在创建迭代器之后的任何时候对列表进行结构修改，除了通过迭代器自己的remove或add方法之外，迭代器将抛出ConcurrentModificationException 。 因此，在并发修改的情况下，迭代器快速而干净地失败，而不是在未来的未确定时间冒任意，非确定性行为的风险。

* 请注意，迭代器的快速失败行为无法得到保证，因为一般来说，在存在不同步的并发修改时，不可能做出任何硬性保证。 失败快速迭代器以尽力而为的方式抛出ConcurrentModificationException 。 因此，编写依赖于此异常的程序以确保其正确性是错误的： 迭代器的快速失败行为应该仅用于检测错误。
***
 
## 构造方法 

* ArrayList()	
> 构造一个初始容量为10的空列表。

* ArrayList​(int initialCapacity)	
> 构造具有指定初始容量的空列表。

* ArrayList​(Collection<? extends E> c)	
> 按照集合的迭代器返回的顺序构造一个包含指定集合元素的列表。
方法摘要
 
## 所有方法实例方法具体的方法

* void	add​(int index, E element)	
> 将指定元素插入此列表中的指定位置。

* boolean	add​(E e)	
> 将指定的元素追加到此列表的末尾。

* boolean	addAll​(int index, Collection<? extends E> c)	
> 从指定位置开始，将指定集合中的所有元素插入此列表。

* boolean	addAll​(Collection<? extends E> c)	
> 将指定集合中的所有元素按指定集合的Iterator返回的顺序附加到此列表的末尾。

* void	clear()	
> 从此列表中删除所有元素。

* Object	clone()	
> 返回此 ArrayList实例的浅表副本。

* boolean	contains​(Object o)	
> 如果此列表包含指定的元素，则返回 true 。

* void	ensureCapacity​(int minCapacity)	
> 如有必要，增加此 ArrayList实例的容量，以确保它至少可以容纳由minimum capacity参数指定的元素数。

* void	forEach​(Consumer<? super E> action)	
> 对 Iterable每个元素执行给定操作，直到处理 Iterable所有元素或操作引发异常。

* E	get​(int index)	
> 返回此列表中指定位置的元素。

* int	indexOf​(Object o)	
> 返回此列表中第一次出现的指定元素的索引，如果此列表不包含该元素，则返回-1。

* boolean	isEmpty()	
> 如果此列表不包含任何元素，则返回 true 。

* Iterator<E>	iterator()	
> 以适当的顺序返回此列表中元素的迭代器。

* int	lastIndexOf​(Object o)	
> 返回此列表中指定元素最后一次出现的索引，如果此列K表不包含该元素，则返回-1。

* ListIterator<E>	listIterator()	
> 返回此列表中元素的列表迭代器（按适当顺序）。

* ListIterator<E>	listIterator​(int index)	
> 从列表中的指定位置开始，返回列表中元素的列表迭代器（按正确顺序）。

* E	remove​(int index)	
> 删除此列表中指定位置的元素。

* boolean	remove​(Object o)	
> 从该列表中删除指定元素的第一个匹配项（如果存在）。

* boolean	removeAll​(Collection<?> c)	
> 从此列表中删除指定集合中包含的所有元素。

* boolean	removeIf​(Predicate<? super E> filter)	
> 删除此集合中满足给定谓词的所有元素。

* protected void	removeRange​(int fromIndex, int toIndex)	
> 从此列表中删除索引介于 fromIndex （含）和 toIndex （独占）之间的所有元素。

* boolean	retainAll​(Collection<?> c)	
> 仅保留此列表中包含在指定集合中的元素。

* E	set​(int index, E element)	
> 用指定的元素替换此列表中指定位置的元素。

* int	size()	
> 返回此列表中的元素数。

* Spliterator<E>	spliterator()	
> 在此列表中的元素上创建late-binding和故障快速 Spliterator 。

* List<E>	subList​(int fromIndex, int toIndex)	
> 返回指定的 fromIndex （包含）和 toIndex （不包括）之间的此列表部分的视图。

* Object[]	toArray()	
> 以适当的顺序（从第一个元素到最后一个元素）返回包含此列表中所有元素的数组。

* <T> T[]	toArray​(T[] a)	
> 以适当的顺序返回包含此列表中所有元素的数组（从第一个元素到最后一个元素）; 返回数组的运行时类型是指定数组的运行时类型。

* void	trimToSize()	
> 将此 ArrayList实例的容量调整为列表的当前大小。

 