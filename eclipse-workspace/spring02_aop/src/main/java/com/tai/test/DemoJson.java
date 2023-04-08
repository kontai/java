package com.tai.test;

import com.tai.pojo.Users;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoJson {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Users user=new Users();
		user.setId(1);
		user.setName("張三");
		user.setPassword("123");
		
		
	}

}
