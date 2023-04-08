package com.tai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAOP {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo2 demo = ac.getBean("demo2", Demo2.class);
		demo.demo1("kontai");
		demo.demo2("tai",12);
		demo.demo3();
	}

}
