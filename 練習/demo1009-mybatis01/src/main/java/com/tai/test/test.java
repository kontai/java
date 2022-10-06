package com.tai.test;

import com.tai.pojo.People;
import com.tai.service.PeopleService;
import com.tai.service.PeopleServiceImpl;

import javax.servlet.annotation.WebServlet;
import java.util.List;

public class test {
    public static void main(String[] args) {
        PeopleService ps=new PeopleServiceImpl();
        List<People> list=ps.showPeople();
        System.out.println(list);
    }
}
