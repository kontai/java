package 集合框架.III泛型.III_自定義泛型.I泛型類;

import 集合框架.III泛型.II_comparator.Person;

public class Worker extends Person {

	public Worker() {
		super();
		
	}

	public Worker(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		
		return "Worker:"+getName()+":"+getAge();
	}
	
	
 
}
