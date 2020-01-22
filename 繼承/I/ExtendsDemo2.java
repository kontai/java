package 繼承.I;

/*
在子父類中，成員的特點體現。
1，成員變量。
2，成員函數。
3，構造函數。



*/

//1，成員變量。

/*
當本類的成員和局部變量同名用this區分。
當子父類中的成員變量同名用super區分父類。

this和super的用法很相似。

this:代表一個本類對象的引用。
super：代表一個父類空間。



*/
class Fu
{
	private int num = 4;

	public int getNum()
	{
		return num;
	}
}


class Zi extends Fu
{
	private int num = 5;


	void show()
	{
		System.out.println(this.num+"....."+super.getNum());
	}
}


class ExtendsDemo2 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
	}
}
