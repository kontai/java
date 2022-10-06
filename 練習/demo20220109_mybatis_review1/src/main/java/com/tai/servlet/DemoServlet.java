package com.tai.servlet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/pool")
public class DemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            Context ctxt = new InitialContext();
            DataSource ds = (DataSource) ctxt.lookup("java:comp/env/test");
            Connection conn = ds.getConnection();
            PrintWriter out = res.getWriter();
            out.println("success");
            out.flush();
//            out.close();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
            res.sendRedirect("index.jsp");
        }
    }
}
