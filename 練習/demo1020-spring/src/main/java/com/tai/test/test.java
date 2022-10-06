package com.tai.test;

import com.tai.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.image.BufferedImage;

public class test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person ppl=context.getBean("peo",Person.class);
        System.out.println(ppl);
    }


}
