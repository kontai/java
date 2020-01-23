package 實例;

/*
畢老師用電腦上課。

問題領域中涉及兩個對象。
畢老師，電腦。

分析其中的問題。

比如電腦藍屏啦。冒煙啦。



*/

class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}
}

class NoPlanException extends Exception
{
	NoPlanException(String msg)
	{
		super(msg);
	}
}

class Computer
{
	private int state = 2;
	public void run()throws LanPingException,MaoYanException
	{
		if(state==1)
			throw new LanPingException("電腦藍屏啦！！");
		if(state==2)
			throw new MaoYanException("電腦冒煙啦！！");

		System.out.println("電腦運行");
	}
	public void reset()
	{
		state = 0;
		System.out.println("電腦重啟");
	}
}

class Teacher
{
	private String name;
	private Computer comp;
	Teacher(String name)
	{
		this.name = name;
		comp = new Computer();
	}
	
	public void prelect()throws NoPlanException
	{
		try
		{
			comp.run();
			System.out.println(name+"講課");
			
		}
		catch (LanPingException e)
		{
			System.out.println(e.toString());
			comp.reset();
			prelect();
		}
		catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();
			//可以對電腦進行維修。
//			throw e;
			throw new NoPlanException("課時進度無法完成，原因："+e.getMessage());
		}

	}
	public void test()
	{
		System.out.println("大家練習");
	}
}	
class ExceptionTest 
{
	public static void main(String[] args) 
	{
		Teacher t  = new Teacher("畢老師");
		try
		{
			t.prelect();
			
		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString()+"......");
			System.out.println("換人");

		}
	}
}


/*

class NoAddException extends Exception
{}

void addData(Data d)throws NoAddException
{

	連接數據庫
	try
	{
	添加數據。出現異常 SQLException();
	}
	catch(SQLException e)
	{
		//處理代碼。

		throw new NoAddException();
	}
	fianlly
	{
	關閉數據庫。
	}
}


*/