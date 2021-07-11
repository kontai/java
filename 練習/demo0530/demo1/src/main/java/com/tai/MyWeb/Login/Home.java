package com.tai.MyWeb.Login;

import com.tai.MyWeb.User.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Home", value = "/Home")
public class Home extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");

        //獲取Session
        User u = (User) req.getSession().getAttribute("user");
//        String name=  req.getParameter("uname");
        String name = u.getUname();
        resp.getWriter().write("<b>Welcome!" + name + "</b>");

        //獲取訪問次數
        int count =(int) this.getServletContext().getAttribute("count");
        resp.getWriter().write("你已經訪問此網站" + count + "次");
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
