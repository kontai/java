package X_wait與sleep的區別;
/*
wait 和 sleep 區別？

1，wait可以指定時間也可以不指定。
   sleep必須指定時間。

2，在同步中時，對cpu的執行權和鎖的處理不同。
	wait：釋放執行權，釋放鎖。
	sleep:釋放執行權，不釋放鎖。
*/


class Demo
{

	void show() throws InterruptedException
	{
		synchronized(this)// 
		{
		 
			wait();//t0 t1 t2
		
		}
	}
	void method()
	{
		synchronized(this)//t4
		{
		
			//wait();

			notifyAll();
		
		
		}//t4
	}
}




class wait和sleep的区别
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
