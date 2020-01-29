package VIII線程間通信.I示例;
/*
線程間通訊：
多個線程在處理同一資源，但是任務卻不同。


*/

//資源
class Resource
{
	String name;
	String sex;
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
				System.out.println(r.name+"....."+r.sex);
			}
		}
	}
}



class  ResourceDemo
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
