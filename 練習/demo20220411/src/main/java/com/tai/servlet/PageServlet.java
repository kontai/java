package com.tai.servlet;

import com.tai.dao.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PageServlet", value = "/page")
public class PageServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;character=utf-8");

        HttpSession session = req.getSession();
        if (session.getAttribute("user") == null) {
            resp.sendRedirect("/loginCheck");
            return;
        }
        ServletContext sc=this.getServletContext();
        int num= (int) sc.getAttribute("num");

        User user = (User) req.getSession().getAttribute("user");
        resp.getWriter().write("瀏覽人數:"+num);
        resp.getWriter().write("<h1>Welcome," + user.getUname() + " to my HomePage.<h1>");

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
