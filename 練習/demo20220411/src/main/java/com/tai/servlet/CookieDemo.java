package com.tai.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ckDemo")
public class CookieDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie ck1 = new Cookie("mouse", "logi");
        Cookie ck2 = new Cookie("PC", "asus");
        //設置有效時間(單位:秒)
        ck2.setMaxAge(3 * 24 * 3600);
        //設置有效路徑
        ck2.setPath("/abc");
        resp.addCookie(ck1);
        resp.addCookie(ck2);
        resp.getWriter().write("Hello");
        //super.service(req, resp);
    }
}
