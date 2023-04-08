package com.tai.test;

import org.springframework.stereotype.Component;

@Component
public class Demo2 {

	public void demo1(String name1) {
		System.out.println("demo1()");
//		int i=5/0;
	}

	public void demo2(String name1,int age1) {
		System.out.println("demo2()");

	}

	public void demo3() {
		System.out.println("demo3()");
		int i=5/0;

	}
}