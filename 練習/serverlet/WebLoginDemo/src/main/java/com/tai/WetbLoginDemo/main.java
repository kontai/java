package com.tai.WetbLoginDemo;

import com.tai.JDBC.LoginCheckImp;
import com.tai.JDBC.LoginService;
import com.tai.User.User;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.websocket.Session;
import java.io.IOException;


/**
 * @author kontai
 */
@WebServlet(name = "main", value = "/main")
public class main extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        User user = null;
        LoginService ls = new LoginCheckImp();

        Logger logger = Logger.getLogger(main.class.getName());

        user = ls.LoginCheckJDBC(uname, pwd);

        if (user != null) {
            Cookie cookie = new Cookie("uid", user.getUid() + "");
            ServletContext sl = this.getServletConfig().getServletContext();
            sl.setAttribute("user", user);
            logger.debug("test" + user.getUid() + "," + user.getUname());

//            System.out.println("Main getUid.... uid="+user.getUid());
            //設置cookie時效
            cookie.setMaxAge(60);
            resp.addCookie(cookie);
//            resp.getWriter().write("<b>歡迎<b>" + uname);
            resp.sendRedirect("welcome");
        } else {
            System.out.println("資料有誤!");
//             req.getRequestDispatcher("errorPage").forward(req,resp);
            resp.sendRedirect("errorPage");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
