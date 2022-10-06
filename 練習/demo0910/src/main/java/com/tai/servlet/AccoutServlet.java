package com.tai.servlet;

import com.tai.pojo.Account;
import com.tai.service.AccountService;
import com.tai.service.AccountServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/trans")
public class AccoutServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        AccountService service=new AccountServiceImpl();


        Account accOut=new Account();
        accOut.setAccno(req.getParameter("accOutaccNo"));
        accOut.setPassword(Integer.parseInt(req.getParameter("accOutPassword")));
        accOut.setBalance(-Double.parseDouble(req.getParameter("balance")));

        Account accIn=new Account();
        accIn.setAccno(req.getParameter("accInaccNo"));
        accIn.setName(req.getParameter("accInName"));
        accIn.setBalance(Double.parseDouble(req.getParameter("balance")));

        int result = service.show(accIn, accOut);
        if(result==AccountService.SUCCESS){
            resp.sendRedirect("/page");
        }else{
            System.out.println("轉帳失敗\n錯誤代碼"+result);
            HttpSession session=req.getSession();
            session.setAttribute("errorCode",result);
            resp.sendRedirect("error.jsp");
        }


    }
}
