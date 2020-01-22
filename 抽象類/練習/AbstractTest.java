package 練習;/*
僱員示例：
需求：公司中程序員有姓名，工號，薪水，工作內容。
項目經理除了有姓名，工號，薪水，還有獎金，工作內容。
對給出需求進行數據建模。



分析：
在這個問題領域中，先找出涉及的對象。
通過名詞提煉法。
程序員：
	屬性：姓名，工號，薪水、
	行為：工作。
經理：
	屬性：姓名，工號，薪水，獎金。
	行為：工作。


程序員和經理不存在著直接繼承關係，

但是程序員和經理卻具有共性內容。
可以進行抽取。因為他們都是公司的僱員 

可以將程序員和經理進行抽取.建立體系.
	
*/

//描述僱員。

abstract class Employee
{
	private String name;
	private String id;
	private double pay;
	Employee(String name,String id,double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	public abstract void work();
	
}


//描述程序員。
class Programmer extends Employee
{
	Programmer(String name,String id,double pay)
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.println("code...");
	}
}

//描述經理。 
class Manager extends Employee
{
	private int bonus;
	Manager(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
		this.bonus = bonus;
	}
	public void work()
	{
		System.out.println("manage");
	}
}






class  AbstractTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


class Person
{
	private String name;
	private int age;

	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
class Student extends Person
{
	Student(String name,int age)
	{
		super(name,age);
	}

}
class Worker extends Person
{
	Worker(String name,int age)
	{
		super(name,age);
	}

}