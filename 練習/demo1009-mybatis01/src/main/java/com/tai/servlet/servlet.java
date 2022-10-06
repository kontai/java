package com.tai.servlet;

import com.tai.pojo.People;
import com.tai.service.PeopleService;
import com.tai.service.PeopleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/demo")
public class servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PeopleService ps=new PeopleServiceImpl();
        List<People> list=ps.showPeople();
        System.out.println(list);
        req.setAttribute("list",list);
        long creationTime = req.getSession().getCreationTime();
        System.out.println("creatLogTime");
        req.getSession().setAttribute("sessionList",list);
//        resp.sendRedirect("index.jsp");
        req.getRequestDispatcher("index.jsp").forward(req,resp);
//        req.setAttribute("people",)

    }
}
