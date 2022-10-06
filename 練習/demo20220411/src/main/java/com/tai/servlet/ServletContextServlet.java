package com.tai.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletContextServlet", value = "/scDemo")
public class ServletContextServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");


        ServletContext sc = this.getServletContext();
        ServletContext sc2 = this.getServletConfig().getServletContext();
        ServletContext sc3 = req.getSession().getServletContext();
        String num = sc3.getInitParameter("num");
        System.out.println(num);
//        System.out.println(sc==sc2);
//        System.out.println(sc2==sc3);

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
