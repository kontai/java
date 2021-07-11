package com.tai.cookie;

import com.tai.MyWeb.JDBC.JDBCImp;
import com.tai.MyWeb.JDBC.JDBCInt;
import com.tai.MyWeb.User.User;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginCheckWithCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        //獲取Cookie數組
        User u = null;
        Cookie[] cookies = req.getCookies();
        String uid = "";

        //Cookie:設置/獲取訪問次數
        int count = 0;
        if (this.getServletContext().getAttribute("count") != null) {
            count = (int) this.getServletContext().getAttribute("count");
            count++;
        } else {
            System.out.println("__第一次訪問__");
            count = 1;
        }
        this.getServletContext().setAttribute("count", count);

        if (cookies != null) {
            System.out.println("not null");
            for (Cookie ck : cookies) {
                System.out.println(ck.getName() + ":" + ck.getValue());
                if ((ck.getName()).equals("uid")) {
                    uid = ck.getValue();
                    JDBCInt jdbc = new JDBCImp();
                    u = jdbc.LoginCheckInUid(uid);
                    if (u != null) {
                        //獲取Session
                        HttpSession hs = req.getSession();
                        hs.setAttribute("user", u);
//                        req.getRequestDispatcher("/Home").forward(req, resp);
                        resp.sendRedirect("/Home");
                        return;
                    }
                }
            }
            if ("".equals(uid)) {
                System.out.println("uid為空");
                resp.sendRedirect("login.jsp");
            }
        } else {
            System.out.println("無cookie");
//            req.getRequestDispatcher("login.jsp").forward(req,resp);
            resp.sendRedirect("login.jsp");
        }

    }
}
