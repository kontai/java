package IX_JDK1_5新特性.利用多個監視器;/*
jdk1.5以後將同步和鎖封裝成了對象。 
並將操作鎖的隱式方式定義到了該對像中，
將隱式動作變成了顯示動作。

Lock 接口的实现允许锁在不同的作用范围内获取和释放，并允许以任何顺序获取和释放多个锁，从而支持使用这种技术。
Lock接口： 出現替代了同步代碼塊或者同步函數。將同步的隱式鎖操作變成現實鎖操作。

同時更為靈活。可以一個鎖上加上多組監視器。
lock():獲取鎖。
unlock():釋放鎖，通常需要定義finally代碼塊中。


Condition接口：出現替代了Object中的wait notify notifyAll方法。
			將這些監視器方法單獨進行了封裝，變成Condition監視器對象。
			可以任意鎖進行組合。
await();
signal();
signalAll();



*/

import java.util.concurrent.locks.*;

class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;

//	創建一個鎖對象。
	Lock lock = new ReentrantLock();

	//通過已有的鎖獲取該鎖上的監視器對象。
//	Condition con = lock.newCondition();

	//通過已有的鎖獲取兩組監視器，一組監視生產者，一組監視消費者。
	Condition producer_con = lock.newCondition();
	Condition consumer_con = lock.newCondition();

	
	public  void set(String name)//  t0 t1
	{
		lock.lock();
		try
		{
			while(flag)
//			try{lock.wait();}catch(InterruptedException e){}//   t1    t0
			try{producer_con.await();}catch(InterruptedException e){}//   t1    t0
		
			this.name = name + count;//烤鴨1  烤鴨2  烤鴨3
			count++;//2 3 4
			System.out.println(Thread.currentThread().getName()+"...生產者5.0..."+this.name);//生產烤鴨1 生產烤鴨2 生產烤鴨3
			flag = true;
//			notifyAll();
//			con.signalAll();
			consumer_con.signal();
		}
		finally
		{
			lock.unlock();
		}
		
	}

	public  void out()// t2 t3
	{
		lock.lock();
		try
		{
			while(!flag)
//			try{this.wait();}catch(InterruptedException e){}	//t2  t3
			try{consumer_con.await();}catch(InterruptedException e){}	//t2  t3
			System.out.println(Thread.currentThread().getName()+"...消費者.5.0......."+this.name);//消費烤鴨1
			flag = false;
//			notifyAll();
//			con.signalAll();
			producer_con.signal();
		}
		finally
		{
			lock.unlock();
		}
		
	}
}

class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.set("烤鴨");
		}
	}
}

class Consumer implements Runnable
{
	private Resource r;
	Consumer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}



class  ProducerConsumerDemo2
{
	public static void main(String[] args) 
	{
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);
		t0.start();
		t1.start();
		t2.start();
		t3.start();

	}
}

