package 三自定義異常與異常分類;

/*
對於角標是整數不存在，可以用角標越界表示，
對於負數為角標的情況，準備用負數角標異常來表示。

負數角標這種異常在java中並沒有定義過。
那就按照java異常的創建思想，面向對象，將負數角標進行自定義描述。並封裝成對象。

這種自定義的問題描述成為自定義異常。 

注意：如果讓一個類稱為異常類，必須要繼承異常體系，因為只有稱為異常體系的子類才有資格具備可拋性。
	才可以被兩個關鍵字所操作，throws throw




異常的分類：
1，編譯時被檢測異常:只要是Exception和其子類都是，除了特殊子類RuntimeException體系。 
		這種問題一旦出現，希望在編譯時就進行檢測，讓這種問題有對應的處理方式。
		這樣的問題都可以針對性的處理。


2，編譯時不檢測異常(運行時異常):就是Exception中的RuntimeException和其子類。
		這種問題的發生，無法讓功能繼續，運算無法進行，更多是因為調用者的原因導致的而或者引發了內部狀態的改變導致的。
		那麼這種問題一般不處理，直接編譯通過，在運行時，讓調用者調用時的程序強制停止,讓調用者對代碼進行修正。



所以自定義異常時，要麼繼承Exception。要麼繼承RuntimeException。


throws 和throw的區別。

1，throws使用在函數上。
   throw使用在函數內。
2，throws拋出的是異常類，可以拋出多個，用逗號隔開。
   throw拋出的是異常對象。


*/
class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}


class Demo
{
	public int method(int[] arr,int index)//throws NullPointerException//FuShuIndexException
	{

		if(arr==null)
			throw new NullPointerException("數組的引用不能為空！");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("數組的角標越界啦，哥們，你是不是瘋了？："+index);
		}
		if(index<0)
		{
//			throw new FuShuIndexException("角標變成負數啦！！");
		}
		return arr[index];
	}
}

class  ExceptionDemo3
{
	public static void main(String[] args) //throws FuShuIndexException
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("over");
	}
	
}

/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
}
*/