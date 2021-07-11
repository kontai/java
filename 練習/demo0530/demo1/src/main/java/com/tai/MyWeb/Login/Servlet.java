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
        user = jd.LoginCheck(uname, pwd);
        if (user != null) {
            System.out.println(user.getUname() + ":" + user.getPwd() + ":" + user.getDate());
            String uid= String.valueOf(user.getUid());
            Cookie cookie=new Cookie("uid",uid);
            cookie.setMaxAge(3*24*3600);
//            cookie.setPath("/lc");
            resp.addCookie(cookie);

            //創建Session,如不存在,就創建
            HttpSession hs=req.getSession();
            hs.setAttribute("user",user);
            hs.setMaxInactiveInterval(3600);

            resp.sendRedirect("/Home");
            //返回,以下語句不執行
            return;

        } else {
            resp.setStatus(500);
            resp.getWriter().write("查無此人");
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


