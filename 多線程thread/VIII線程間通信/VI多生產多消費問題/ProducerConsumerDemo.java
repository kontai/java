package VIII線程間通信.VI多生產多消費問題;
/*
生產者，消費者。

多生產者，多消費者的問題。
if判斷標記，只有一次，會導致不該運行的線程運行了。出現了數據錯誤的情況。
while判斷標記，解決了線程獲取執行權後，是否要運行！

notify:只能喚醒一個線程，如果本方喚醒了本方，沒有意義。而且while判斷標記+notify會導致死鎖。
notifyAll解決了本方線程一定會喚醒對方線程的問題。


*/

class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name)//  
	{
		while(flag)
			try{this.wait();}catch(InterruptedException e){}//   t1    t0
		
		this.name = name + count;//烤鴨1  烤鴨2  烤鴨3
		count++;//2 3 4
		System.out.println(Thread.currentThread().getName()+"...生產者..."+this.name);//生產烤鴨1 生產烤鴨2 生產烤鴨3
		flag = true;
		notifyAll();
	}

	public synchronized void out()//  t3
	{
		while(!flag)
			try{this.wait();}catch(InterruptedException e){}	//t2  t3
		System.out.println(Thread.currentThread().getName()+"...消費者........"+this.name);//消費烤鴨1
		flag = false;
		notifyAll();
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



class  ProducerConsumerDemo
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

