package com.tai.demo2;

import com.tai.MyWeb.User.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class myHome extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //設置請求編碼格式
        req.setCharacterEncoding("utf-8");

        //設置響應編碼格式
        resp.setContentType("text/html; charset=UTF-8");

        //獲取請求訊息
        getServletConfig().getServletContext().getServerInfo();
        getServletContext().getInitParameter("myname");
        User testUser=null;


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
