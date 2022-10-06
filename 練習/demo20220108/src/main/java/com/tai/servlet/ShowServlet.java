package com.tai.servlet;

import com.tai.pojo.Flower;
import com.tai.service.FlowerService;
import com.tai.serviceImpl.FlowerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    FlowerService service = new FlowerServiceImpl();
    List<Flower> list = null;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        list = service.show();
        req.setAttribute("list", list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
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
