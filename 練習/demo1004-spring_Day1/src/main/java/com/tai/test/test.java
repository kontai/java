package com.tai.test;

import com.tai.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//        People peo = ac.getBean("peo",People.class);
//        System.out.println(peo);
        People peo1=ac.getBean("peo1",People.class);
        System.out.println(peo1);
    }
}
