package com.tai.Servlet;

import com.tai.LoginService.*;
import com.tai.LoginService.LoginServiceImp;
import com.tai.User.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ck")
public class ck extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ck j = new ck();
        //判斷有無Cookie
        User user = null;
        String uid = "";
        Cookie[] c = req.getCookies();
        if (c != null) {
            for (Cookie cookie : c) {
                if (cookie.getName().equals("uid")) {
                    uid = cookie.getValue();
                }
            }
            if (uid.equals("")) {
                jump(req, resp);
            } else {
                LoginService ls = new LoginServiceImp();
                user = ls.LoginCookieCheck(uid);

                if (user != null) {
                        resp.sendRedirect("main");
                } else {
//                    req.setAttribute("msg", "uid not found!");
                    jump(req, resp);
                }
            }

        } else {
            //if without Cookie , 轉發login
            jump(req, resp);
        }
    }

    void jump(HttpServletRequest req, HttpServletResponse resp) {

        try {
            req.getRequestDispatcher("/login").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

