#Java HashSet


* HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。

* HashSet 允许有 null 值。

* HashSet 是无序的，即不会记录插入的顺序。

* HashSet 不是线程安全的，如果多个线程尝试同时修改HashSet，则最终结果是不确定的。您必须在多线程访问时显式同步对HashSet的并发访问。

* HashSet 实现了 Set 接口。
***

##构造方法                         
###构造器
* 1.HashSet()	
> 构造一个新的空集; 支持HashMap实例具有默认初始容量（16）和加载因子（0.75）。
* 2.HashSet​(int initialCapacity)	
> 构造一个新的空集; 支持HashMap实例具有指定的初始容量和默认加载因子（0.75）。
* 3.HashSet​(int initialCapacity, float loadFactor)	
> 构造一个新的空集; 支持HashMap实例具有指定的初始容量和指定的加载因子。
* 4.HashSet​(Collection<? extends E> c)	
> 构造一个包含指定集合中元素的新集合。

***

##方法摘要

* boolean	add​(E e)	
> 如果指定的元素尚不存在，则将其添加到此集合中。
*void	clear()	
> 从该集中删除所有元素。
* Object	clone()	
> 返回此 HashSet实例的浅表副本：未克隆元素本身。
* boolean	contains​(Object o)	
> 如果此set包含指定的元素，则返回 true 。
* boolean	isEmpty()	
> 如果此集合不包含任何元素，则返回 true 。
* Iterator<E>	iterator()	
> 返回此set中元素的迭代器。
* boolean	remove​(Object o)	
> 如果存在，则从该集合中移除指定的元素。
* int	size()	
> 返回此集合中的元素数（基数）。
* Spliterator<E>	spliterator()	
> 在此集合中的元素上创建late-binding和失败快速 Spliterator 。