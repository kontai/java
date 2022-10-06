package com.tai.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class poolDemo {

    public void show() {
        Context context = null;
        DataSource ds;

        try {
             context = new InitialContext();
            ds = (DataSource) context.lookup("java:comp/env/test");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        {
            String sql = "select * from account";
            try {
                conn = ds.getConnection();
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                System.out.println("success!");
                if (rs.next()) {
                    System.out.println(rs.getString(1) + ":" + rs.getString(2));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}