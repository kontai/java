package com.tai.Demo0710.MyServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ck", value = "/ck")
public class ck extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");

        if (req.getSession().getAttribute("uid") == null) {
            ifNull(resp);
        } else {
            ifNotNull(resp);
        }

    }

    private void ifNotNull(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("Home.jsp");
    }

    public void ifNull(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("login.jsp");
    }

}
