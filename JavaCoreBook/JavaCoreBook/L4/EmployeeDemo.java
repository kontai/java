package JavaCoreBook.L4;//package JavaCoreBook.L4;

import java.time.*;

class Emplyee
{
	private String name;
	private double salary;
	private LocalDate  hairday;

	public	Emplyee(String name,double salary, int year,int month,int day)
	{
		this.name=name;
		this.salary=salary;
		this.hairday=LocalDate.of(year,month,day);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name){this.name=name;}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double sl){this.salary=sl;}

	public LocalDate getDay()
	{
		return hairday;
	}

	public static void swap(Emplyee x,Emplyee y)
	{
		Emplyee temp=x;
		x=y;
		y=temp;
		System.out.println("\n對象方法調用after swap----值傳遞(call by value)");
		System.out.printf("name:%s , Salary:%.3f , Hair Date:%d-%d-%d\n",x.getName(),x.getSalary(),x.getDay().getYear(),x.getDay().getMonthValue(),x.getDay().getDayOfMonth());
		Emplyee New=new Emplyee("MyName",22,1033,4,5);
		x=New;
	}


}

public class EmployeeDemo
{
	public static void main(String[] args)
	{
		Emplyee A=new Emplyee("kontai",23456,2004,3,1);
		Emplyee B=new Emplyee("nick",34567,2005,2,1);
		System.out.printf("name:%s , Salary:%.3f , Hair Date:%d-%d-%d\n",A.getName(),A.getSalary(),A.getDay().getYear(),A.getDay().getMonthValue(),A.getDay().getDayOfMonth());
		System.out.printf("name:%s , Salary:%.3f , Hair Date:%d-%d-%d\n",B.getName(),B.getSalary(),B.getDay().getYear(),B.getDay().getMonthValue(),B.getDay().getDayOfMonth());

		Emplyee C=new Emplyee("Bob",292,2013,6,22);
		Emplyee.swap(A,C);

		System.out.println("**************************");
		System.out.printf("name:%s , Salary:%.3f , Hair Date:%d-%d-%d\n",A.getName(),A.getSalary(),A.getDay().getYear(),A.getDay().getMonthValue(),A.getDay().getDayOfMonth());
		C=A;
		C.setName("Foo");
		C.setSalary(40);
		System.out.println("**************************");
		System.out.println("淺複製....");
		System.out.printf("name:%s , Salary:%.3f , Hair Date:%d-%d-%d\n",A.getName(),A.getSalary(),A.getDay().getYear(),A.getDay().getMonthValue(),A.getDay().getDayOfMonth());
		System.out.printf("name:%s , Salary:%.3f , Hair Date:%d-%d-%d\n",C.getName(),C.getSalary(),C.getDay().getYear(),C.getDay().getMonthValue(),C.getDay().getDayOfMonth());
	}


}
