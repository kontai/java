/*
子父類中的構造函數的特點。

在子類構造對像時，發現，訪問子類構造函數時，父類也運行了。
為什麼呢？
原因是：在子類的構造函數中第一行有一個默認的隱式語句。 super();

子類的實例化過程：子類中所有的構造函數默認都會訪問父類中的空參數的構造函數。
	
			
為什麼子類實例化的時候要訪問父類中的構造函數呢？
那是因為子類繼承了父類，獲取到了父類中內容(屬性)，所以在使用父類內容之前，
要先看父類是如何對自己的內容進行初始化的。

所以子類在構造對像時，必須訪問父類中的構造函數。 
為了完成這個必須的動作，就在子類的構造函數中加入了super()語句。

如果父類中沒有定義空參數構造函數，那麼子類的構造函數必須用super明確要調用
父類中哪個構造函數。同時子類構造函數中如果使用this調用了本類構造函數時，
那麼super就沒有了，因為super和this都只能定義第一行。所以只能有一個。
但是可以保證的是，子類中肯定會有其他的構造函數訪問父類的構造函數。


注意：supre語句必須要定義在子類構造函數的第一行。因為父類的初始化動作要先完成。





*/

class fu
{
	int num ;
	fu()
	{
		num =10;
		System.out.println("A fu run");
	}
	fu(int x)
	{
		System.out.println("B fu run..."+x);
	}
}
class ZI extends fu
{
	int num;
	ZI()
	{
		//super();//調用的就是父類中的空參數的構造函數。
		
		System.out.println("C ZI run"+num);
	}
	ZI(int x)
	{
		this();
		//super();
//		super(x);
		System.out.println("D ZI run "+x);
	}
}

class  ExtendsDemo4
{
	public static void main(String[] args) 
	{
		new ZI(6);
	}
}
//class Demo//extends Object
//{
//	/*
//
//	Demo()
//	{
//		super();
//		return;
//	}
//	*/
//}
//
