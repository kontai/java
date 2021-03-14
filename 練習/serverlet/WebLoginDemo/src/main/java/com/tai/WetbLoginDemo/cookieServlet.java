package com.tai.WetbLoginDemo;

import com.tai.User.User;
import com.tai.JDBC.LoginCheckImp;
import com.tai.JDBC.LoginService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/*
 * CookieServlet:入口,檢查是否存在Cookie
 * if yes , 直接跳轉至歡迎網頁
 * else , 跳轉至登入網頁,做登入動作
 */
@WebServlet(name = "cookieServlet", value = "/ck")
public class cookieServlet extends HttpServlet {
    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        resp.getWriter().write("hello\n");
        Cookie[] cookies = req.getCookies();
        User user = null;
        String uid = null;
        if (cookies != null) {
            for (Cookie ck : cookies) {
                if (ck.getName().equals("uid")) {
                    uid = ck.getValue();
                    System.out.println(uid);
                }

            }
            if (uid != null) {
                resp.getWriter().write("UID=" + uid + "\n");
                resp.getWriter().write("check user...\n");
                LoginService ls = new LoginCheckImp();
                user = ls.uidCheck(uid);

                if (user != null) {
                    resp.getWriter().write("UID=" + user.getUid() + "");
                    resp.getWriter().write("user已經獲取,UID=" + user.getUid());
                    //創建Session(存入Cookie)
                    HttpSession hs = req.getSession();
                    System.out.println("JSessionID:\n"+hs.getId());
                    hs.setAttribute("uname",user.getUname());
                    resp.sendRedirect("welcome");
                    return;
                } else {
                    System.out.println("UID獲取失敗");
//                    jump(req, resp);
                    req.getRequestDispatcher("Login.jsp").forward(req,resp);
                }
            } else
                jump(req, resp);
        }
    }

    /**
     * @param req
     * @param resp
     *
     */
    private void jump(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.sendRedirect("Login.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
