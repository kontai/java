package com.tai.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/aj")
public class ajaxServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("測試一下!");
//        resp.sendRedirect("http:////www.google.com");
    }
}
