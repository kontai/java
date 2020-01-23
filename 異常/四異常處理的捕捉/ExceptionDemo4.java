package 四異常處理的捕捉;/*

異常處理的捕捉形式：
這是可以對異常進行針對性處理的方式。

具體格式是：

try
{
	//需要被檢測異常的代碼。
}
catch(異常類 變量)//該變量用於接收發生的異常對像
{
	//處理異常的代碼。
}
finally
{
	//一定會被執行的代碼。
}





異常處理的原則：
1，函數內容如果拋出需要檢測的異常，那麼函數上必須要聲明。
	否則必須在函數內用trycatch捕捉，否則編譯失敗。
	
2，如果調用到了聲明異常的函數，要麼trycatch要麼throws，否則編譯失敗。

3，什麼時候catch，什麼時候throws 呢？
	功能內容可以解決，用catch。
	解決不了，用throws告訴調用者，由調用者解決 。

4，一個功能如果拋出了多個異常，那麼調用時，必須有對應多個catch進行針對性的處理。
	內部又幾個需要檢測的異常，就拋幾個異常，拋出幾個，就catch幾個。





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
	public int method(int[] arr,int index) throws FuShuIndexException//throws NullPointerException,FuShuIndexException
	{	
		if(arr==null)
			throw new NullPointerException("沒有任何數組實體");
		if(index<0)
			throw new FuShuIndexException();
			
		return arr[index];
	}
}

class  ExceptionDemo4
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];		
		Demo d = new Demo();
		try
		{
			int num = d.method(null,-1);
			System.out.println("num="+num);
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch (FuShuIndexException e)
		{
			System.out.println("message:"+e.getMessage());
			System.out.println("string:"+e.toString());

			e.printStackTrace();//jvm默認的異常處理機制就是調用異常對象的這個方法。

			System.out.println("負數角標異常!!!!");
		}
		/*
		catch(Exception e)//多catch父類的catch放在最下面。
		{
			
		}
		*/
		System.out.println("over");
	}
	
}
