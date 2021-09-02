package com.tai.Demo0710.MyServlet.invoke;

import com.tai.Demo0710.User.User;
import com.tai.Demo0710.dao.JDBCinterfaceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "checkSession", value = "/checkSession")
public class MainInvoke extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user;

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");


        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        int uid;

        JDBCinterfaceImpl jdbc = new JDBCinterfaceImpl();
        user = jdbc.chekUser(uname, pass);
        if (user != null) {
//                req.setAttribute("uname",user.getUsername());
            uid = user.getUid();

            //新增cookie
            Cookie ck = new Cookie("uid", String.valueOf(uid));
            Cookie ck2=new Cookie("uname",user.getUsername() );
            ck.setMaxAge(3 * 24 * 3600);
            ck2.setMaxAge(3 * 24 * 3600);

            ck.setPath("/ck");
            ck2.setPath("/ck");
            resp.addCookie(ck);
            resp.addCookie(ck2);


            req.getSession().setAttribute("uid", uid);
            req.getSession().setAttribute("uname", user.getUsername());

            System.out.println("session已存入uid:" + uid);

            // 获取 session 创建时间
            Date createTime = new Date(req.getSession().getCreationTime());
            // 获取该网页的最后一次访问时间
            Date lastAccessTime = new Date(req.getSession().getLastAccessedTime());

            //设置日期输出的格式
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            if(this.getServletContext().getAttribute("number")!=null)
            {
                int num=Integer.parseInt((String) this.getServletContext().getAttribute("number"));
                num+=1;
                this.getServletContext().setAttribute("number",num);
            }else{

                this.getServletContext().setAttribute("number",1);
            }

            req.getSession().setAttribute("createTime", df.format(createTime));
            req.getSession().setAttribute("lastAccessTime", df.format(lastAccessTime));

            //設置session有效時間
            req.getSession().setMaxInactiveInterval(15 * 60);

            resp.sendRedirect("Home.jsp");
//            req.getRequestDispatcher("Home.jsp").forward(req, resp);
        } else {
            req.setAttribute("errMsg", "找不到此用戶");
            resp.sendRedirect("login.jsp");
//                try {
//                    req.getRequestDispatcher("login.jsp").forward(req,resp);
//                } catch (ServletException e) {
//                    e.printStackTrace();
//                }
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
