#Java Queue

>- 1.poll(): 移除并返问队列头部的元素 如果队列为空，则返回null
>- 2.peek(): 返回队列头部的元素 如果队列为空，则返回null
>- 3.put(): 添加一个元素 如果队列满，则阻塞
>- 4.take(): 移除并返回队列头部的元素 如果队列为空，则阻塞
>- 5.offer(): 添加一个元素并返回true 如果队列已满，则返回false
>- 6.element(): 返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常
>- 7.remove(): 移除并返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常