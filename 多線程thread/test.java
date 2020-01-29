package I多線程thread;

//class aa extends Thread
class aa implements Runnable
{
	private int num=100;
	Object obj=new Object();

	public void run()
	{
		while (true)
		{
			synchronized(obj)
			{
				if (num > 0)
				{
					try
					{ Thread.sleep(10); }    catch (InterruptedException e) { }
					System.out.println(Thread.currentThread().getName() + "...." + num--);
				}
			}
		}

	}
}

public class test
{
	public static void main(String[] args)
	{

		aa t=new aa();
		Thread a=new Thread(t);
		Thread b=new Thread(t);
		Thread c=new Thread(t);
		Thread d=new Thread(t);
		Thread e=new Thread(t);
		Thread f=new Thread(t);
		Thread g=new Thread(t);
		Thread h=new Thread(t);
		Thread i=new Thread(t);
		Thread j=new Thread(t);


		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		f.start();
		g.start();
		h.start();
		i.start();
		j.start();
	}

}
