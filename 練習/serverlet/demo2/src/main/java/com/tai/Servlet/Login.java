package com.tai.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //獲取登入狀態屬性
        String msg =(String) req.getAttribute("msg")==null?"":(String) req.getAttribute("msg");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("<body>");
        resp.getWriter().write("<form action='page' method='GET'>");
        resp.getWriter().write("使用者名稱<input type='text' autofocus name='uname'></br>");
        resp.getWriter().write("使用者密碼<input type='password' name='pwd'></br>");
        resp.getWriter().write("<span style='color:red;font size=10px;'>"+msg+"</span></br>");
        resp.getWriter().write("<input type='submit' value='提交'>");
        resp.getWriter().write("</form>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</html>");
//        super.service(req, resp);
        Cookie c1=new Cookie("Mouse","logitech");
        //設置時效
//        c1.setMaxAge(3*24*3600);
        c1.setMaxAge(3);
        //添加Cookie至response
        resp.addCookie(c1);
    }
    //    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
