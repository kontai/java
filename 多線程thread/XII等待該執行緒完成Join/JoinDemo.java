package XII等待該執行緒完成Join;

class Demo implements Runnable
{
	public void run()
	{
		for(int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread().toString()+"....."+x);
			Thread.yield();
		}
	}
}

class  JoinDemo
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();


		t2.start();
//		t2.setPriority(Thread.MAX_PRIORITY);

		t1.join();//t1線程要申請加入進來，運行。臨時加入一個線程運算時可以使用join方法。

		for(int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread()+"....."+x);
		}
	}
}
