package 單一實例.懶漢式;
/*
設計模式：對問題行之有效的解決方式。其實它是一種思想。

1,單例設計模式。
	解決的問題：就是可以保證一個類在內存中的對象唯一性。

必須對於多個程序使用同一個配置信息對像時，就需要保證該對象的唯一性。

如何保證對像唯一性呢？
1，不允許其他程序用new創建該類對象。
2，在該類創建一個本類實例。
3，對外提供一個方法讓其他程序可以獲取該對象。

步驟：
1，私有化該類構造函數。
2，通過new在本類中創建一個本類對象。
3，定義一個公有的方法，將創建的對象返回。



*/

//餓漢式
class Single//類一加載，對象就已經存在了。
{
	private static Single s = new Single();

	private Single(){}

	public static Single getInstance()
	{
		return s;
	}
}


//懶漢式
class Single2//類加載進來，沒有對象，只有調用了getInstance方法時，才會創建對象。
			//延遲加載形式。 
{
	private static Single2 s = null;

	private Single2(){}

	public static Single2 getInstance()
	{
		if(s==null)
			s = new Single2();
		return s;
	}
}


class  SingleDemo
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		System.out.println(s1==s2);
		
//		Single ss = Single.s;

//		Test t1 = new Test();
//		Test t2 = new Test();
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		t1.setNum(10);
		t2.setNum(20);
		System.out.println(t1.getNum());
		System.out.println(t2.getNum());
	}
}


class Test
{
	private int num;

	private static Test t = new Test();
	private Test(){}
	public static Test getInstance()
	{
		return t;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}

}
