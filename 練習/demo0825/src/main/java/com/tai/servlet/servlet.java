package com.tai.servlet;


import com.tai.pojo.PageInfo;
import com.tai.service.PeopleService;
import com.tai.service.PeopleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show")
public class servlet extends HttpServlet {
    private PeopleService sv=new PeopleServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String pageSizeStr=req.getParameter("pageSize");
        int pageSize=2;
        if(pageSizeStr!=null && !pageSizeStr.equals("")){
            System.out.println("pageSizeStr="+pageSize);
            pageSize=Integer.parseInt(pageSizeStr);
        }
//        int   pageSize = Integer.parseInt(req.getParameter("pageSize"));
        String pageNumberStr=req.getParameter("pageNumber");
        int pageNumber=1;
        if(pageSizeStr!=null && !pageNumberStr.equals("")){
            System.out.println("pageNumber="+pageNumber);
             pageNumber = Integer.parseInt(pageNumberStr);
        }
        PageInfo info = sv.show(pageSize,pageNumber);
        req.setAttribute("PageInfo",info);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
