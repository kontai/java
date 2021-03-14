package com.tai.SessionDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "main")
public class main extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset='utf-8'");
        //獲取Session
        HttpSession s=req.getSession();
        s.setAttribute("name","kontai");
        s.setMaxInactiveInterval(5);
        //獲取jessieID
        String id = s.getId();
        String name= (String) s.getAttribute("name");
        System.out.println("name="+name);
        resp.getWriter().write("hello,"+name);
        System.out.println(id);
        s.invalidate();
        resp.getWriter().write("hello,"+name);

//        super.service(req, resp);
    }
}
