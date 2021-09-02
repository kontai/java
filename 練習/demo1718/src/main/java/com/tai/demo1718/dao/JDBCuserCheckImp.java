package com.tai.demo1718.dao;

import com.tai.demo1718.vo.User;

import java.sql.*;

public class JDBCuserCheckImp implements JDBCuserCheck {
    @Override
    public User userCheck(String username) {
        User u = null;

        String driver = "com.mysql.jdbc.Driver";
        String server = "jdbc:mysql://localhost:3306/";
        String mysqDB = "webdb";
        String mysqlUsername = "root";
        String mysqlPassword = "@@@@@";

        String sql = "select * from t_user where uname=? ";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(server + mysqDB, mysqlUsername, mysqlPassword);
            System.out.println("server connecting success .....");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                u = new User(rs.getString("uname"));
                u.setPwd(rs.getString("pwd"));
                u.setBirth(rs.getDate("birth"));
                u.setSex(rs.getString("sex"));
            }
            System.out.println("uname=" + u.getUname());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return u;
    }
}
