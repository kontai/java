package com.tai.WetbLoginDemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "welcome", value = "/welcome")
public class welcome extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);

        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        HttpSession session = req.getSession();
        resp.getWriter().write("歡迎!"+session.getAttribute("uname"));
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
