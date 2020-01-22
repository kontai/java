
/*
抽像類和接口的異同點：

相同點：
	都是不斷向上抽取而來的。


不同點：
	1，抽像類需要被繼承，而且只能單繼承。
	   接口需要被實現，而且可以多實現。 
	2，抽像類中可以定義抽像方法和非抽像方法，子類繼承後，可以直接使用非抽像方法。
	   接口中只能定義抽像方法，必須由子類去實現。 
	3，抽像類的繼承，是is a關係，在定義該體系的基本共性內容。
	   接口的實現是 like a 關係，在定義體系額外功能。




犬按功能分：有導盲犬，搜爆犬。


abstract class 犬
{
	abstract void 吼叫();
}

//abstract class 導盲
interface 導盲
{
	abstract void 導盲();
}


class 導盲犬 extends 犬 implements 導盲
{
	public void 吼叫()
	{
	}
	public void 導盲(){}
}



//在不同的問題領域中，有不同的分析方式。
學員：
	學習。
	抽煙學員




煙民。
	







*/

class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
