package com.tai.MyWeb.Login;

import com.tai.MyWeb.JDBC.*;
import com.tai.MyWeb.User.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/main")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        User user = null;
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        JDBCInt jd = new JDBCImp();
        user=jd.LoginCheck(uname,pwd);
        if (user != null) {
            System.out.println(user.getUname() + ":" + user.getPwd() + ":" + user.getDate());
        } else {
            resp.setStatus(500);
            resp.getWriter().write("驅動載入失敗");
        }


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
