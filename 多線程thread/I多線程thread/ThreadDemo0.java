package I多線程thread;
/*
进程：正在进行中的程序(直译).

线程：就是进程中一个负责程序执行的控制单元(执行路径)
一个进程中可以多执行路径，称之为多线程。

一个进程中至少要有一个线程。

开启多个线程是为了同时运行多部分代码。

每一个线程都有自己运行的内容。这个内容可以称为线程要执行的任务。

多线程好处：解决了多部分同时运行的问题。

多线程的弊端：线程太多回到效率的降低。


其实应用程序的执行都是cpu在做着快速的切换完成的。这个切换是随机的。


JVM启动时就启动了多个线程，至少有两个线程可以分析的出来。

1，执行main函数的线程，
		该线程的任务代码都定义在main函数中。

2，负责垃圾回收的线程。


*/


class Demo extends Object
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}


class  ThreadDemo0
{
	public static void main(String[] args) 
	{

		new Demo();
		new Demo();
		new Demo();
		System.gc();
		System.out.println("Hello World!");
	}
}

/*
public static void gc()运行垃圾回收器。
调用 gc 方法暗示着 Java 虚拟机做了一些努力来回收未用对象，以便能够快速地重用这些对象当前占用的内存。当控制权从方法调用中返回时，虚拟机已经尽最大努力从所有丢弃的对象中回收了空间。

调用 System.gc() 实际上等效于调用：

 Runtime.getRuntime().gc()

 */
