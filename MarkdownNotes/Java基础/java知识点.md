多线程是Java程序的并发机制，它能同步共享数、处理不同的事件.  
Java语言中，垃圾回收机制对系统中不使用的内存进行回收，从而使程序员从繁忙的内存管理中解放出来.  
Java编写好的程序首先由编译器转换为标准字节代码，然后由虚拟机执行。虚拟机把字节代码程序与各操作系统和硬件分开，使Java程序独立于平台.  
Java的代码安全检测体现在多个层次上，在编译层、解释层、平台层分别作不同的安全检查.
###  

Java类成员访问控制权限：  
![avatar](http://r0k8todwk.hd-bkt.clouddn.com/java1.png)  
JDK1.8中使用default修饰的默认方法，如果一个类实现的两个接口中都存在同名的默认方法，那么需要在类中进行重写.  
声明为static和transient类型的成员数据不能被串行化。因为static代表类的状态， transient代表对象的临时数据.  
![avatar](http://r0k8todwk.hd-bkt.clouddn.com/java2.png)  
![avatar](http://r0k8todwk.hd-bkt.clouddn.com/java3.png)  
![avatar](http://r0k8todwk.hd-bkt.clouddn.com/java4.png) 
###  
 
会话跟踪是一种灵活、轻便的机制，它使Web上的状态编程变为可能.  
HTTP是一种无状态协议，每当用户发出请求时，服务器就会做出响应，客户端与服务器之间的联系是离散的、非连续的。当用户在同一网站的多个页面之间转换时，根本无法确定是否是同一个客户，会话跟踪技术就可以解决这个问题。当一个客户在多个页面间切换时，服务器会保存该用户的信息.  
有四种方法可以实现会话跟踪技术：URL重写、隐藏表单域、Cookie、Session.  
1）.隐藏表单域：<input type="hidden">，非常适合不需要大量数据存储的会话应用.  
2）.URL 重写:URL可以在后面附加参数，和服务器的请求一起发送，这些参数为名字/值对.  
3）.Cookie:一个Cookie是一个小的，已命名数据元素。服务器使用SET-Cookie头标将它作为HTTP响应的一部分传送到客户端，客户端被请求保存Cookie值，在对同一服务器的后续请求使用一个
Cookie头标将之返回到服务器。与其它技术比较，Cookie的一个优点是在浏览器会话结束后，甚至在客户端计算机重启后它仍可以保留其值.  
4）.Session：使用setAttribute(String str,Object obj)方法将对象捆绑到一个会话  
###  

Applet 类是浏览器类库中最为重要的类，同时也是所有 JAVA 小应用程序的基本类。 一个 Applet 应用程序从开始运行到结束时所经历的过程被称为 Applet 的生命周期。 Applet 的生命周期涉及 init() 、 start() 、 stop() 和 destroy() 四种方法，这 4 种方法都是 Applet 类的成员，可以继承这些方法，也可以重写这些方法，覆盖原来定义的这些方法。除此之外，为了在 Applet 程序中实现输出功能，每个 Applet 程序中还需要重载 paint() 方法：  
1、  public void init()  
init()方法是 Applet 运行的起点。当启动 Applet 程序时，系统首先调用此方法，以执行初始化任务.  
2、  public void start()  
start()方法是表明 Applet 程序开始执行的方法。当含有此 Applet 程序的 Web 页被再次访问时调用此方法。因此，如果每次访问 Web 页都需要执行一些操作的话，就需要在 Applet 程序中重载该方法。在 Applet 程序中，系统总是先调用 init() 方法，后调用 start() 方法.  
3、  public void stop()  
stop()方法使 Applet 停止执行，当含有该 Applet 的 Web 页被其他页代替时也要调用该方法.  
4、  public void destroy()  
destroy()方法收回 Applet 程序的所有资源，即释放已分配给它的所有资源。在 Applet 程序中，系统总是先调用 stop() 方法，后调用 destroy() 方法.  
5、  paint(Graphics g)  
paint(Graphics g)方法可以使 Applet 程序在屏幕上显示某些信息，如文字、色彩、背景或图像等。参数 g 是 Graphics 类的一个对象实例，实际上可以把 g 理解为一个画笔。对象 g 中包含了许多绘制方法，如 drawstring() 方法就是输出字符串.  
###   

![avatar](http://r0k8todwk.hd-bkt.clouddn.com/java5.png)

###  

子进程得到的是除了代码段是与父进程共享以外，其他所有的都是得到父进程的一个副本，子进程的所有资源都继承父进程，得到父进程资源的副本，子进程可获得父进程的所有堆和栈的数据，但二者并不共享地址空间。两个是单独的进程，继承了以后二者就没有什么关联了，子进程单独运行；进程的线程之间共享由进程获得的资源，但线程拥有属于自己的一小部分资源，就是栈空间，保存其运行状态和局部自动变量的.  
线程之间共享进程获得的数据资源，所以开销小，但不利于资源的管理和保护；而进程执行开销大，但是能够很好的进行资源管理和保护.  
线程的通信速度更快，切换更快，因为他们共享同一进程的地址空间.  
一个进程可以有多个线程，线程是进程的一个实体，是CPU调度的基本单位.  
###  

HashSet 它不是线程安全的，属于Set接口下的实现类，Set下的实现类特征就是无序，不允许存储相同的对象.  
ConcurrentHashMap 它是线程安全的HashMap实现，特征也相似，其中存储的值对象可以重复，键对象不能重复.  
Collection接口是List接口和Set接口的父接口，通常情况下不被直接使用.  
ArrayList线程不安全的，底层是数组实现，允许存放重复对象.  
###   

被abstract修饰的类就是抽象类，有没有抽象方法无所谓.  
String是不可修改的，且java运行环境中对string对象有一个对象池保存.  
final修饰的方法只是不能重写，static修饰的方法只能访问类的成员变量.  


