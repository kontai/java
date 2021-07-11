package com.tai.ServletContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StaticServContext", value = "/sv")
public class StaticServContext extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.  setContentType("text/html; charset=UTF-8");
         ServletContext sv=this.getServletContext();
         String count=sv.getInitParameter("count");
        System.out.println(count);
//        super.service(req, resp);
    }
    /*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
     */
}
