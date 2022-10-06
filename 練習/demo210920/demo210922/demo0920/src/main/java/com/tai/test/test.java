package com.tai.test;

import com.tai.pojo.*;
import com.tai.mapper.LogDemo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();


        Scanner sin = new Scanner(System.in);
        System.out.println("請輸入轉帳戶:");
        String accIn=sin.nextLine();
        Scanner sout=new Scanner(System.in);
        System.out.println("請輸出轉帳戶:");
        String accOut=sout.nextLine();


        LogDemo mapper = session.getMapper(LogDemo.class);
//      List<Log> list=  mapper.selAll("1","3");
        List<Log> list = mapper.selChoose(accIn,accOut);


    }
}
