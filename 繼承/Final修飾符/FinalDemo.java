package 繼承.Final修飾符;

//繼承弊端：打破了封裝性。
/*
final關鍵字：
1，final是一個修飾符，可以修飾類，方法，變量。
2，final修飾的類不可以被繼承。
3，final修飾的方法不可以被覆蓋。
4，final修飾的變量是一個常量，只能賦值一次。
	為什麼要用final修飾變量。其實在程序如果一個數據是固定的，
	那麼直接使用這個數據就可以了，但是這樣閱讀性差，所以它該數據起個名稱。
	而且這個變量名稱的值不能變化，所以加上final固定。

	寫法規範：常量所有字母都大寫，多個單詞，中間用_連接。



*/
class Fu
{
	void method()
	{
		//調用了底層系統的資源。
	}
}
class Zi extends Fu
{
	public static final double MY_PI = 3.14;
	static final int x = 7;

	void method()
	{
//		final int x = 9;
//		x = 9;
		final int NUMBER = 9;
		
		System.out.println(MY_PI);
	}
}

class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
