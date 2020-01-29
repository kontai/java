package I多線程thread;/*
��̬��ͬ������ʹ�õ�����  �ú��������ֽ����ļ����� 
������ getClass������ȡ��Ҳ�����õ�ǰ  ����.class ��ʾ��


*/

class Ticket implements Runnable
{
	private static  int num = 100;
//	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
//		System.out.println("this:"+this.getClass());

		if(flag)
			while(true)
			{
				synchronized(Ticket.class)//(this.getClass())
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
				this.show();
	}

	public static synchronized void show()
	{
		if(num>0)
		{
			try{Thread.sleep(10);}catch (InterruptedException e){}
			
			System.out.println(Thread.currentThread().getName()+".....function...."+num--);
		}
	}
}

class StaticSynFunctionLockDemo 
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();

//		Class clazz = t.getClass();
//		
//		Class clazz = Ticket.class;
//		System.out.println("t:"+t.getClass());

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t.flag = false;
		t2.start();
	}
}
