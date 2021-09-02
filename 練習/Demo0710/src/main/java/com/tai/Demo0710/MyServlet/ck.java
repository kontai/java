package com.tai.Demo0710.MyServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ck", value = "/ck")
public class ck extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");

        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie ck : cookies) {
                if (ck.getName().equals("uid")) {
                    req.getSession().setAttribute("uid", Integer.parseInt(ck.getValue()));
                    System.out.println("get Cookie uid=" + ck.getValue());
                }
                if(ck.getName().equals("uname")){
                    req.getSession().setAttribute("uname", ck.getValue());
                }
            }
        }

        if (req.getSession().getAttribute("uid") == null) {
            resp.sendRedirect("login.jsp");
        } else {
            resp.sendRedirect("Home.jsp");
        }

    }


}
