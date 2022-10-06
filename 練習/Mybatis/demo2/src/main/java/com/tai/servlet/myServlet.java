package com.tai.servlet;

import com.tai.pojo.People;
import com.tai.service.PeopleService;
import com.tai.service.impl.PeopleServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "myServlet", value = "/sv")
public class myServlet extends HttpServlet {
    People ppl=null;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //設置請求-響應編碼格式
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        PeopleService service=new PeopleServiceImpl();
        ppl=service.show("tai");
        if(ppl!=null){
            resp.getWriter().write(ppl.toString());
        }else {
            resp.getWriter().write("<h1>not found</h1>");
        }



    }
    //    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
