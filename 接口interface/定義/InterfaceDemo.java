package 接口interface.定義;/*
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}

當一個抽像類中的方法都是抽像的時候，這時可以將該抽像類用
另一種形式定義和表示，就是 接口 interface。
*/

//定義接口使用的關鍵字不是class，是interface.
/*
對於接口當中常見的成員：而且這些成員都有固定的修飾符。
1，全局常量: public  static final 

2，抽像方法。public abstract 

由此得出結論，接口中的成員都是公共的權限.


*/
interface Demo
{
	public static final int NUM = 4;

	public abstract void show1();
	public abstract void show2();
}
//類與類之間是繼承關係，類與接口直接是實現關係。 
/*
接口不可以實例化。

只能由實現了接口的子類並覆蓋了接口中所有的抽像方法後，該子類才可以實例化。
否則，這個子類就是一個抽像類。

*/


class DemoImpl implements /*實現*/Demo
{
	public void show1()
	{}

	public void show2()
	{
	
	}
}


/*
在java中不直接支持多繼承，因為會出現調用的不確定性。
所以java將多繼承機制進行改良，在java中變成了多實現。

一個類可以實現多個接口。 

*/

interface A
{
	public void show();
}

interface Z
{
	public int add(int a,int b);
}




class Test implements A,Z//多實現
{
	
	public int add(int a,int b)
	{
		return a+b+3;	
	}
	/**/
	public void show(){}
	
}





/*
一個類在繼承另一個類的同時，還可以實現多個接口。



*/
class Q
{
	public void method()
	{}
}

abstract class Test2 extends Q implements A,Z
{

}
/*
接口的出現避免了單繼承的局限性。

*/


interface CC
{
	void show();
}
interface MM
{
	void method();
}

interface QQ extends  CC,MM//接口與接口之間是繼承關係，而且接口可以多繼承。 
{
	void function();
}

class WW implements QQ
{
//覆蓋3個方法。
	public void show(){}
	public void method(){}
	public void function(){}
}


class InterfaceDemo 
{
	public static void main(String[] args) 
	{

		Test t = new Test();
		t.show();

//		DemoImpl d = new DemoImpl();	
//		System.out.println(d.NUM);
//		System.out.println(DemoImpl.NUM);
//		System.out.println(Demo.NUM);
	}
}



