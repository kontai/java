package com.tai.servlet;

import com.tai.dao.User;
import com.tai.service.Impl.UserServiceImpl;
import com.tai.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "MyServlet", value = "/loginCheck")
public class LoginServlet extends HttpServlet {
    UserService service = new UserServiceImpl();

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("uname="+req.getParameter("uname"));
//        System.out.println("pwd="+req.getParameter("pwd"));
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");



        String name = req.getParameter("uname");
        String password = req.getParameter("pwd");
        System.out.println(name + " " + password);

        User user = service.show(name, password);


        if (user != null) {
            int num=0;
            ServletContext sc = this.getServletContext();
            if(sc.getAttribute("num")!=null) {
                num = (int) sc.getAttribute("num");
            }else{
                System.out.println("num=null  ,   set num=0");
            }
            sc.setAttribute("num", ++num);

            HttpSession session = req.getSession();
            req.getSession().setAttribute("user", user);

            resp.getWriter().write("User name=" + user.getUname());
            resp.getWriter().write("User password=" + user.getPwd());

            //增加cookie
            Cookie cookie = new Cookie("aid", user.getAid());
            cookie.setMaxAge(3 * 24 * 36000);
            cookie.setPath("/ck");
            resp.addCookie(cookie);

            req.setAttribute("name", user.getUname());
//            req.getRequestDispatcher("homepage.jsp").forward(req,resp);
            resp.sendRedirect("page");
        } else {
            resp.getWriter().write("User not found");
//            req.getSession().invalidate();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resp.sendRedirect("/");
        }

//        super.service(req, resp);
    }
    //    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
