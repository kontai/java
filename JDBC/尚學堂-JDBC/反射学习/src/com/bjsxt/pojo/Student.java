package com.bjsxt.pojo;

public class Student extends Person{
	//�n�����������ݩ�
	public String sname="�i�T";
	protected int sage;
	
	public String getSsex() {
		return ssex;
	}


	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	String sfav;
	private String ssex="�k";
	public static int money=1000;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String ssex){
		this.ssex=ssex;
	}
	
	
	public int sHi(){
		return 2;
	}
	
	public String sHi(int num,String str){
		System.out.println(str+num);
		return str+num;
	}
	
	
	public static String sHi(String str){
		System.out.println(str);
		return str;
	}
	
	protected void sHello(){
		System.out.println("Student.sHello(protected)");
	}
	
	private void sHello1(){
		System.out.println("Student.sHello1(private)");
		
		
	}
	void sHello2(){
		System.out.println("Student.sHello2(default)");
	}	
}
