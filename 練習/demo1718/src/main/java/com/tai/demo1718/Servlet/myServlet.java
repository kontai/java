package com.tai.demo1718.Servlet;

import com.google.gson.Gson;
import com.tai.demo1718.dao.JDBCuserCheck;
import com.tai.demo1718.dao.JDBCuserCheckImp;
import com.tai.demo1718.vo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "myServlet", value = "/sv")
public class myServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user=null;

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("utf-8");

        String uname=req.getParameter("name");
        JDBCuserCheck jb=new JDBCuserCheckImp();
        user=jb.userCheck(uname);
        if(user!=null){
            System.out.println(user.getUname()+":"+user.getPwd());
//            resp.getWriter().write("name="+user.getUname());
            resp.getWriter().write(new Gson().toJson(user));
        }


    }
}
