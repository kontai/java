package com.tai.pojo;

public class User {
	private String name;
	private int age;
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//	private Set<?> number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	/*
	public Set<?> getNumber() {
		return number;
	}
	public void setNumber(Set<?> number) {
		this.number = number;
	}
	*/
	
	
	

}
