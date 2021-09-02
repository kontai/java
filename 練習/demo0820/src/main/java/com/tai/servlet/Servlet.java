package com.tai.servlet;

import com.tai.pojo.People;
import com.tai.service.PerpleService;
import com.tai.service.PerpleServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", value = "/ssm")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //設置編格對式
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PerpleService pl=new PerpleServiceImpl();
        List<People> list=pl.show();
        req.setAttribute("list",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
