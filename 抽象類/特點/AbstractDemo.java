
/*
抽像類：
抽像：籠統，模糊，看不懂！不具體。



特點：
1，方法只有聲明沒有實現時，該方法就是抽像方法，需要被abstract修飾。
	抽像方法必須定義在抽像類中。該類必須也被abstract修飾。
2，抽像類不可以被實例化。為什麼？因為調用抽像方法沒意義。
3，抽像類必須有其子類覆蓋了所有的抽像方法後，該子類才可以實例化。
	否則，這個子類還是抽像類。


1，抽像類中有構造函數嗎？
	有，用於給子類對像進行初始化。


	
2，抽像類可以不定義抽像方法嗎？
	可以的。 但是很少見，目的就是不讓該類創建對象。AWT的適配器對象就是這種類。
	通常這個類中的方法有方法體，但是卻沒有內容。

	abstract class Demo
	{
		void show1()
		{}
		

		void show2()
		{}
	}



3，抽像關鍵字不可以和那些關鍵字共存?
	private 不行
	static	不行
	final	不行



4，抽像類和一般類的異同點。
	相同點：
		抽像類和一般類都是用來描述事物的，都在內部定了成員。
	不同：
		1，一般類有足夠的信息描述事物。
		   抽像類描述事物的信息有可能不足。
		2，一般類中不能定義抽像方法，只能定非抽像方法。
		   抽像類中可定義抽像方法，同時也可以定義非抽像方法。
		3，一般類可以被實例化。
		   抽像類不可以被實例化。




5，抽像類一定是個父類嗎？
	是的。因為需要子類覆蓋其方法後才可以對子類實例化。 




*/

abstract class DemoI
{
	abstract /*抽像*/ void show();
	
}

/*

class DemoA extends DemoI
{
	void show()
	{
		System.out.println("demoa show");
	}
}
class DemoB extends DemoI
{
	void show()
	{
		System.out.println("demob show");
	}
}
*/
abstract class 犬科
{
	abstract void 吼叫();
}

class 狗 extends 犬科
{
	
	void 吼叫()
	{
		System.out.println("汪汪");
	}
}
class 狼 extends 犬科
{
	void 吼叫()
	{
		System.out.println("嗷嗷");
	}
}



class AbstractDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


