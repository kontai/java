package com.tai.demo0720;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet", value = "/sv")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        req.setAttribute("list",list);

        req.getRequestDispatcher("jstl.jsp").forward(req,resp);


    }
}

