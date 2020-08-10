package object類;/*

Object:所有類的根類。

Object是不斷抽取而來，具備著所有對象都具備的共性內容。

常用的共性功能：






*/
/*
class Fu // extends Object
{
	Fu()
	{
		super();
	}
}
class Zi extends Fu
{
	Zi()
	{
		super();
	}
}
*/

class Person {
	private int age;
	Person(int age)
	{
		this.age = age;
	}
	/*
	//比較Person的年齡。是否是同齡人
	public boolean compare(com.sxt.server.basic.Person p)
	{
		return this.age == p.age;	
	}
	*/

	/*
	一般都會覆蓋此方法，根據對象的特有內容，建立判斷對象是否相同的依據。
	*/

	public boolean equals(Object obj)//Object obj = p2;
	{
		if(!(obj instanceof Person))
		{
//			return false;
			throw new ClassCastException("類型錯誤");
		}
		Person p = (Person)obj;
		return this.age == p.age;
	}
/*
	public int hashCode()
	{
		return age;
	}
*/

	public String toString()
	{
		return "com.sxt.server.basic.Person :"+age;
	}
}
class Demo
{
}


class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(60);
		Person p2 = new Person(20);
		Demo d = new Demo();
//		System.out.println(p1.equals(p2));

//		System.out.println(p1);
//		System.out.println(Integer.toHexString(p1.hashCode()));
			

//		Class clazz1 = p1.getClass();
//		Class clazz2 = p2.getClass();
//		System.out.println(clazz1==clazz2);
//		System.out.println(clazz1.getName());

		System.out.println(p1.toString());//com.sxt.server.basic.Person@61de33
		System.out.println(p1.getClass().getName()+"$"+Integer.toHexString(p1.hashCode()));//com.sxt.server.basic.Person@61de33



//		com.sxt.server.basic.Person p3 = p1;

//		Demo d = new Demo();

//		System.out.println(p1==p2);
//		System.out.println(p1.equals(p2));
	}
}
