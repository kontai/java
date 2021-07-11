package com.tai.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author kontai
 */
public class MyCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        String value= URLEncoder.encode("onePlus 7 pro","utf-8");
        Cookie ck=new Cookie("mobile",value);
        ck.setMaxAge(3* 24*3600);
//        ck.setPath("/cookie/abc");
        resp.addCookie(ck);
        resp.getWriter().write("歡迎");
    }
}
