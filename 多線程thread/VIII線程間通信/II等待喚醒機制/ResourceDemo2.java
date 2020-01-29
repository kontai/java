package VIII線程間通信.II等待喚醒機制;

/*
等待/喚醒機制。 

涉及的方法：

1，wait(): 讓線程處於凍結狀態，被wait的線程會被存儲到線程池中。
2，notify():喚醒線程池中一個線程(任意).
3，notifyAll():喚醒線程池中的所有線程。

這些方法都必須定義在同步中。
因為這些方法是用於操作線程狀態的方法。
必須要明確到底操作的是哪個鎖上的線程。


為什麼操作線程的方法wait notify notifyAll定義在了Object類中？ 

因為這些方法是監視器的方法。監視器其實就是鎖。
鎖可以是任意的對象，任意的對象調用的方式一定定義在Object類中。

*/
//資源
class Resource
{
	String name;
	String sex;
	boolean flag = false;
}


//輸入
class Input implements Runnable
{
	Resource r ;
//	Object obj = new Object();
	Input(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException e){}
				if(x==0)
				{
					r.name = "mike";
					r.sex = "nan";
				}
				else
				{
					r.name = "麗麗";
					r.sex = "女女女女女女";
				}
				r.flag = true;
				r.notify();
			}
			x = (x+1)%2;

		}
	}
}
//輸出
class Output implements Runnable
{

	Resource r;
//	Object obj = new Object();
	Output(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.flag)
					try{r.wait();}catch(InterruptedException e){}
				System.out.println(r.name+"....."+r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}



class  ResourceDemo2
{
	public static void main(String[] args) 
	{
		//創建資源。
		Resource r = new Resource();
		//創建任務。
		Input in = new Input(r);
		Output out = new Output(r);
		//創建線程，執行路徑。
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//開啟線程
		t1.start();
		t2.start();
	}
}
