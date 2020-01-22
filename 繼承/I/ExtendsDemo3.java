package I;

//成員函數。
/*
當子父類中出現成員函數一模一樣的情況，會運行子類的函數。
這種現象，稱為覆蓋操作。這時函數在子父類中的特性。
函數兩個特性：
	1，重載。同一個類中。overload
	2，覆蓋。子類中。覆蓋也稱為重寫，覆寫。override
	
覆蓋注意事項：
1，子類方法覆蓋父類方法時，子類權限必須要大於等於父類的權限。 
2，靜態只能覆蓋靜態，或被靜態覆蓋。






*/
class Fu
{
	public static  void show()
	{
		System.out.println("fu show run");
	}
}

class  Zi extends Fu
{
	public static void show()
	{
		System.out.println("Zi show run");
	}
}

class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
//		Zi z = new Zi();
//		z.show();
		NewPhone p = new NewPhone();
		p.show();
		p.call();
	}
}

/*
什麼時候使用覆蓋操作?

當對一個類進行子類的擴展時，子類需要保留父類的功能聲明，
但是要定義子類中該功能的特有內容時，就使用覆蓋操作完成.

*/
class honeP
{
	void call()
	{}
	void show()
	{		
		System.out.println("number");
	}
}

class NewPhone extends honeP
{
	void show()
	{
		System.out.println("name");
		System.out.println("pic");
		super.show();
	}
}











