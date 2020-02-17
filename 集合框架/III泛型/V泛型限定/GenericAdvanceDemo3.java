package 集合框架.III泛型.V泛型限定;

import java.util.ArrayList;


import 集合框架.III泛型.III_自定義泛型.I泛型類.Student;
import 集合框架.III泛型.III_自定義泛型.I泛型類.Worker;
import 集合框架.III泛型.II_comparator.Person;

public class GenericAdvanceDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Person> al1 = new ArrayList<Person>();
		
		al1.add(new Person("abc",30));
		al1.add(new Person("abc4",34));
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		
		al2.add(new Student("stu1",11));
		al2.add(new Student("stu2",22));
		
		
		ArrayList<Worker> al3 = new ArrayList<Worker>();
		
		al3.add(new Worker("stu1",11));
		al3.add(new Worker("stu2",22));
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("abcdeef");
//		al1.addAll(al4);//錯誤，類型不匹配。
		
		al1.addAll(al2);
		al1.addAll(al3);
		
		System.out.println(al1.size());
		
		
//		printCollection(al2);
//		printCollection(al);
	}
	
	

}

/*
 * 一般在存儲元素的時候都是用上限，因為這樣取出都是按照上限類型來運算的。不會出現類型安全隱患。 
 * 
 */

class MyCollection<E>{
	public void add(E e){
	
	}
	public void addAll(MyCollection<? extends E> e){
		
	}
}
