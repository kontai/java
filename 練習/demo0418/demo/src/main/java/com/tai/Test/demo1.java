package com.tai.Test;

import com.tai.Address.Address;
import com.tai.User.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/sv")
public class demo1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        req.setAttribute("str","abcde");
        List<String> list=new ArrayList<String>();
        list.add("身高");
        list.add("體重");
        list.add("視力");
        req.setAttribute("lsit",list);

        Map<String, User> map=new HashMap<String,User>();
        User u=new User("kontai",12,100,new Address("台灣","台北市","內湖"));
        map.put("a1",u);
        req.setAttribute("map",map);

        req.getRequestDispatcher("/myjsp.jsp").forward(req,resp);
//        getServletContext().getRequestDispatcher("/myjsp.jsp").forward(req, resp);


//        super.service(req, resp);
    }
}
