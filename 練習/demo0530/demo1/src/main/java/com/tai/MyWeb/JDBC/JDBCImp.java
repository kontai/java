package com.tai.MyWeb.JDBC;


import java.sql.*;

import com.tai.MyWeb.User.*;

public class JDBCImp implements JDBCInt {
    @Override
    public User LoginCheck(String uname, String pwd) {
        User user = null;
        String driver = "com.mysql.jdbc.Driver";
        String db = "webdb";
        String table = "demo0501";
        String host = "jdbc:mysql://localhost:3306/" + db;
        String username = null;
        String password = null;
        int uid = -1;

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 載入驅動
            Class.forName(driver);
            System.out.println("driver loading success.");
            conn = DriverManager.getConnection(host, "root", "@@@@@");
            ps = conn.prepareStatement("select * from demo0501 where uname=? and pwd=?");
            ps.setString(1, uname);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            while (rs.next()) {
                username = rs.getString("uname");
                password = rs.getString("pwd");
                uid = rs.getInt("uid");
            }
            if (username != null && password != null) {
                user = new User(username, password);
                user.setUid(uid);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("can't find JDBC connect lass");
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return user;
    }

    @Override
    public User LoginCheckInUid(String uid) {
        User user = null;
        String username = null;
        String password = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String db = "webdb";
        String host = "jdbc:mysql://localhost:3306/" + db;

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(host, "root", "@@@@@");
            ps = conn.prepareStatement("select * from demo0501 where uid=?");
            ps.setInt(1, Integer.parseInt(uid));
            rs = ps.executeQuery();
            while (rs.next()) {
                username = rs.getString("uname");
                password = rs.getString("pwd");
            }
            if (username != null && password != null) {
                user = new User(username, password);
                user.setUid(Integer.parseInt(uid));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                rs.close();
                System.out.println("[In Cookiers]資源關閉中..");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                ps.close();
                System.out.println("[In Cookiers]ps:資源關閉中..");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                System.out.println("[In Cookiers]conn:資源關閉中..");
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

        return user;
    }
}
