package com.tai.servlet;

import com.tai.dao.User;
import com.tai.dao.impl.loginCheckImp;
import com.tai.dao.loginCheck;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "checkCookie", value = "/ck")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        Cookie[] cookies = req.getCookies();
        String aid = null;
        if (cookies != null) {
            for (Cookie ck : cookies) {
                if ("aid".equals(ck.getName())) {
                    aid = ck.getValue();
                }
            }
            if (aid == null) {
                resp.sendRedirect("/");
//                req.getRequestDispatcher("/").forward(req, resp);
            } else {
                //獲取aid
                loginCheck lg = new loginCheckImp();

                User user = lg.checkUserWithAID(aid);

                if(user!=null){
                    ServletContext sc = req.getSession().getServletContext();
                    if(sc.getAttribute("num")==null){
                        sc.setAttribute("num",1);
                    }else{
                        int num= (int) sc.getAttribute("num");
                        sc.setAttribute("num",++num);
                    }
                    req.getSession().setAttribute("user",user);

                    //request只能傳送一次請求信息
//                    req.setAttribute("name",user.getUname());
                    resp.sendRedirect("page");
                    return;
                }
            }
        } else {
            req.getRequestDispatcher("/").forward(req, resp);
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
