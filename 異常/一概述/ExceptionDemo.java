package 一概述;
/*
異常：是在運行時期發生的不正常情況。。


在java中用類的形式對不正常情況進行了描述和封裝對象。

描述不正常的情況的類，就稱為異常類。 

以前正常流程代碼和問題處理代碼相結合，
現在將正常流程代碼和問題處理代碼分離。提高閱讀性.


其實異常就是java通過面向對象的思想將問題封裝成了對象.

用異常類對其進行描述。
不同的問題用不同的類進行具體的描述。 比如角標越界。空指針等等。

問題很多，意味著描述的類也很多，
將其共性進行向上抽取，形成了異常體系。

最終問題（不正常情況）就分成了兩大類。
Throwable:無論是error，還是異常，問題，問題發生就應該可以拋出，讓調用者知道並處理。
			//該體系的特點就在於Throwable及其所有的子類都具有可拋性。
			可拋性到底指的是什麼呢？怎麼體現可拋性呢？
			其實是通過兩個關鍵字來體現的。
			throws throw ,凡是可以被這兩個關鍵字所操作的類和對象都具備可拋性.
	|--1，一般不可處理的。Error
			特點：是由jvm拋出的嚴重性的問題。
				 這種問題發生一般不針對性處理。直接修改程序
	|--2，可以處理的。Exception


該體系的特點：
	子類的後綴名都是用其父類名作為後綴，閱讀性很想。






*/
 
class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[1024*1024*800];//java.lang.OutOfMemoryError: Java heap space
//		arr = null;
//		System.out.println(arr[3]);
//
//
//		sleep(-5);
	}


	public static void sleep2(int time)
	{
		if(time<0)
		{
//			處理辦法。
//			處理辦法。
//			處理辦法。
//			處理辦法。
//			處理辦法。
		}
		if(time>100000)
		{
//			處理辦法。
//			處理辦法。
//			處理辦法。
//			處理辦法。
//			處理辦法。
//			處理辦法。
		}
		System.out.println("我睡。。。"+time);

//		sleep(-5);
	}
	public static void sleep(int time)
	{
		if(time<0)
		{
//			拋出 new FuTime();//就代碼著時間為負的情況，這個對象中會包含著問題的名稱，信息，位置等信息。
		}
		if(time>100000)
		{
//			拋出 new BigTime();
		}
		System.out.println("我睡。。。"+time);
	}
}
/*
class FuTime
{
}
class BigTime
{
}
*/