package com.tai.servlet;

import com.tai.service.PeopleService;
import com.tai.service.imp.PeopleServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "page", value = "/page")
public class PageServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        resp.setCharacterEncoding("utf-8");
//        resp.setContentType("text/html;charset=utf-8");

        PeopleService sv=new PeopleServiceImpl();
        List<?> list=sv.showAll();

        if(list!=null){
            req.setAttribute("mylist",list);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else{
            resp.sendRedirect("error.jsp");
        }

    }
}
