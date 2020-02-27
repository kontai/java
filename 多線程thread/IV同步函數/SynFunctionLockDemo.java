package IV同步函數;

/*
同步函數的使用的鎖是this；

同步函數和同步代碼塊的區別：
同步函數的鎖是固定的"this"。

同步代碼塊的鎖是任意的對象。

建議使用同步代碼塊。


*/
class Ticket implements Runnable
{
	private  int num = 100;
//	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
//		System.out.println("this:"+this);

		if(flag)	//提高效率
			while(true)
			{
				synchronized(this)		//避免安全問題
				{
					if(num>0)
					{
						try{Thread.sleep(10);}catch (InterruptedException e){}						
						System.out.println(Thread.currentThread().getName()+".....obj...."+num--);
					}
				}
			}
		else
			while(true)
			{
				this.show();
			}
	}

	public synchronized void show()
	{
		if(num>0)
		{
			try{Thread.sleep(10);}catch (InterruptedException e){}
			
			System.out.println(Thread.currentThread().getName()+".....function...."+num--);
		}
	}
}

class SynFunctionLockDemo 
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
//		System.out.println("t:"+t);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t.flag = false;
		t2.start();
	}
}
