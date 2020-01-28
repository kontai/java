package 多線程中的單例模式;
/*
多線程下的單例

*/

//餓漢式
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}



//懶漢式

/*
加入同步為了解決多線程安全問題。

加入雙重判斷是為了解決效率問題。




class Single
{
	private static Single s = null;

	private Single(){}

	public static Single getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class)		
			{
				if(s==null)
		//				-->0 -->1
					s = new Single();
			}
		}
		return s;
	}
}
*/

class  SingleDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
