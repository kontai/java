package com.tai.webdemo.JDBC;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kontai
 */
public class loginDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
       String uname= req.getParameter("uname");
       String pwd=req.getParameter("pwd");
        System.out.println("uname="+uname);
        System.out.println("pwd="+pwd);
    }
}
