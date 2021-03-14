package com.tai.Servlet;

import com.tai.LoginService.*;
import com.tai.LoginService.LoginServiceImp;
import com.tai.User.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LoginService ls = new LoginServiceImp();
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        User user = ls.LoginServiceCheck(uname, pwd);
        if (user != null) {
            Cookie c = new Cookie("uid", user.getUid() + "");
            System.out.println("UID=" + user.getUid());
            //設置時效
            c.setMaxAge(3 * 24 * 3600);
            c.setPath("ck");
//            c.setSecure(true);
            resp.addCookie(c);
            resp.sendRedirect("main");
        } else {
            req.setAttribute("msg", "username or password error");
            req.getRequestDispatcher("/login").forward(req, resp);
        }
//        super.service(req, resp);
    }
    //    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

}
