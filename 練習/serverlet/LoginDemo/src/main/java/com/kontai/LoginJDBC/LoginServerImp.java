package com.kontai.LoginJDBC;

import java.sql.*;

/**
 * @author kontai
 */
public class LoginServerImp implements LoginServer {
    public User u;
    @Override
    public User LoginCheck(String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_1129", "root", "@@@@@");
            String sql = "select * from t_user where uname=? and pwd=?";
            ps = conn.prepareStatement(sql);
            System.out.println("mysql連接成功");
            ps.setString(1, username);
            ps.setString(2, password);
            res = ps.executeQuery();
            while (res.next()) {
                u = new User();
                u.setUid(res.getInt("uid"));
                u.setUname(res.getString("uname"));
                u.setPwd(res.getString("pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                res.close();
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

        return u;
    }
}
