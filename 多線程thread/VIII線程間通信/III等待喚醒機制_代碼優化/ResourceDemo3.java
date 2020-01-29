package VIII線程間通信.III等待喚醒機制_代碼優化;

class Resource
{
	private String name;
	private String sex;
	private boolean flag = false;

	public synchronized void set(String name,String sex)
	{
		if(flag)
			try{this.wait();}catch(InterruptedException e){}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}

	public synchronized void out()
	{
		if(!flag)
			try{this.wait();}catch(InterruptedException e){}
		System.out.println(name+"...+...."+sex);
		flag = false;
		notify();
	}
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
			if(x==0)
			{
				r.set("mike","nan");
			}
			else
			{
				r.set("麗麗","女女女女女女");
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
			r.out();
		}
	}
}



class  ResourceDemo3
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
