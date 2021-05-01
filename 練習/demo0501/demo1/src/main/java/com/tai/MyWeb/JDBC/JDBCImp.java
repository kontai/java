package com.tai.MyWeb.JDBC;


import java.sql.*;
import com.tai.MyWeb.User.*;

public class JDBCImp implements JDBCInt {
    @Override
    public User LoginCheck(String uname, String pwd) {
        User user = null;
        String driver = "com.mysql.jdbc.Driver";
        String db="webdb";
        String table = "demo0501";
        String host = "jdbc:mysql://localhost:3306/" + db;
        String username = null;
        String password = null;

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 載入驅動
            Class.forName(driver);
            System.out.println("driver loading success.");
        } catch (ClassNotFoundException e) {
            System.out.println("can't find JDBC connect lass");
            e.printStackTrace();

        }
        try {
            //建立連接
            conn = DriverManager.getConnection(host, "root", "@@@@@");
            System.out.println("connection to \" " + table + " \" success.");

            //執行sql語句
            String sql = "select * from demo0501 where  uname=? and pwd=?";
            ps = conn.prepareStatement(sql);
//            ps.setString(1,table);
            ps.setString(1,uname);
            ps.setString(2,pwd);
            rs = ps.executeQuery();


            //獲取執行結果
            while (rs.next()) {
                username = rs.getString("uname");
                password = rs.getString("pwd");
                System.out.println(username+":"+password);
            }
            user = new User(username, password);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                assert rs != null;
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
}
