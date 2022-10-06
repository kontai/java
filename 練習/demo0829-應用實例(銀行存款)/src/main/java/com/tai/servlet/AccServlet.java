package com.tai.servlet;

import com.tai.pojo.Account;
import com.tai.service.AccountService;
import com.tai.service.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Scanner;

@WebServlet("/show")
public class AccServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountService service=new AccountServiceImpl();


        Account acc= service.show("1",2);
        System.out.println("姓名:"+acc.getName()+" 餘額:"+acc.getBalance());;

    }
}
