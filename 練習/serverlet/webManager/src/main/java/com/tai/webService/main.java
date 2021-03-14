package com.tai.webService;

import com.tai.User.User;
import com.tai.jdbc.LoginCheck;
import com.tai.jdbc.LoginCheckImp;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class main extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        User user=null;
        Logger logger=Logger.getLogger(main.class);

        //設置請求編碼格式
        req.setCharacterEncoding("utf-8");
        //設置響應編碼格式
        resp.setContentType("text/html; charset=UTF-8");
        //獲取請求數據o
        String uname = req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        //登入檢查
        LoginCheck lc=new LoginCheckImp();
       user= lc.checkLogin(uname,pwd);
       if(user!=null){
           logger.debug("username="+user.getUname()+",password="+user.getPwd()+",Birthday="+user.getBirth());
//           System.out.println("username="+user.getUname()+",password="+user.getPwd()+",Birthday="+user.getBirth());
//           req.getRequestDispatcher("")
       }

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
