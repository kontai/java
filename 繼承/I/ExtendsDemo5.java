class Fuu
{
	int num=3;
	Fuu()
	{
		super();
		show();
		return;
	}

	void show()
	{
		System.out.println("fu show");
	}
}
class Zii extends Fuu
{
	int num = 8;
	Zii()
	{
		super();
		//-->通過super初始化父類內容時，子類的成員變量並未顯示初始化。等super()父類初始化完畢後，
		//才進行子類的成員變量顯示初始化。

		System.out.println("zi cons run...."+num);
		return;
	}
	void show()
	{
		System.out.println("zi show..."+num);
	}
}
class ExtendsDemo5 
{
	public static void main(String[] args) 
	{
		Zii z = new Zii();
		z.show();
	}
}

/*
一個對像實例化過程：
com.sxt.server.basic.Person p = new com.sxt.server.basic.Person();
1，JVM會讀取指定的路徑下的Person.class文件，並加載進內存，
	並會先加載Person的父類(如果有直接的父類的情況下).
2，在堆內存中的開闢空間，分配地址。
3，並在對像空間中，對對像中的屬性進行默認初始化。
4，調用對應的構造函數進行初始化。
5，在構造函數中，第一行會先到調用父類中構造函數進行初始化。
6，父類初始化完畢後，在對子類的屬性進行顯示初始化。
7，在進行子類構造函數的特定初始化。
8，初始化完畢後，將地址值賦值給引用變量.




*/

