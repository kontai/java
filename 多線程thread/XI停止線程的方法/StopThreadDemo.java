package XI停止線程的方法;

/*
停止線程：
1，stop方法。

2，run方法結束。

怎麼控制線程的任務結束呢?
任務中都會有循環結構，只要控制住循環就可以結束任務。

控制循環通常就用定義標記來完成。

但是如果線程處於了凍結狀態，無法讀取標記。如何結束呢？

可以使用interrupt()方法將線程從凍結狀態強制恢復到運行狀態中來，讓線程具備cpu的執行資格。 

當時強制動作會發生了InterruptedException，記得要處理


*/
class StopThread implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();//t0 t1
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"....."+e);
				flag = false;
			}
			
			System.out.println(Thread.currentThread().getName()+"......++++");
		}
	}
	public void setFlag()
	{
		flag = false;
	}
}



class StopThreadDemo 
{
	public static void main(String[] args) 
	{
		StopThread st = new StopThread();

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);

		t1.start();
		t2.setDaemon(true);	//守護線程（後台線程），當前台線程結束，後台線程自動跟著結束。線程啟動前就須先定義
		t2.start();


		int num = 1;
		for(;;)
		{
			if(++num==50)
			{
//				st.setFlag();
				t1.interrupt();
//				t2.interrupt();
				break;
			}
			System.out.println("main...."+num);
		}

		System.out.println("over");
	}
}
