package com.tai.servlet;

import com.tai.pojo.Flower;
import com.tai.service.FlowerService;
import com.tai.serviceImpl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
    private FlowerService flowerService = new FlowerServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        res.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String production = req.getParameter("production");
        Flower flower=new Flower();
        flower.setName(name);
        flower.setPrice(Double.parseDouble(price));
        flower.setProduction(production);
        int index = flowerService.add(flower);
        if (index > 0) {
//          重定向  防止表單重複提交
            res.sendRedirect("show");
//            req.getRequestDispatcher("show").forward(req, res);
        } else {
            res.sendRedirect("add.jsp");
//            req.getRequestDispatcher("add.jsp").forward(req, res);
        }

    }
}
