package com.tai.dao.impl;

import com.tai.dao.User;
import com.tai.dao.loginCheck;

import java.sql.*;

public class loginCheckImp implements loginCheck {
    @Override
    public User checkUser(String uname, String pwd) {
        User user = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm", "root", "@@@@@");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("伺服器連接成功");

        String sql = "select * from account where name=? and password=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String password = rs.getString("password");
                String aid = rs.getString("accno");
                System.out.println("ps uname=" + name);
                System.out.println("ps pwd=" + password);
                System.out.println("ps accno=" + aid);
//                user.setId(0);
                if (user == null) {
                    user = new User("a", "a");
                }
                user.setUname(name);
                user.setPwd(password);
                user.setAid(aid);

                System.out.println(user.getUname());
                System.out.println(user.getPwd());
                System.out.println(user.getAid());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

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

        return user;
    }

    @Override
    public User checkUserWithAID(String aid) {
        User user = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("mysql Driver not found!!!");
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm", "root", "@@@@@");
        } catch (SQLException e) {
            System.out.println("Server can't connect!");
            throw new RuntimeException(e);
        }
        System.out.println("伺服器連接成功");

        String sql = "select * from account where accno=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, aid);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String password = rs.getString("password");
                System.out.println("ps uname=" + name);
                System.out.println("ps pwd=" + password);
//                user.setId(0);
                user = new User(name, password);
                user.setAid(aid);
                System.out.println(user.getUname());
                System.out.println(user.getPwd());
                System.out.println(user.getAid());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

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

        return user;
    }
}
