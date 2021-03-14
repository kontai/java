package com.tai.LoginService;

import com.tai.User.User;

import java.sql.*;

/**
 * @author kontai
 */
public class LoginJDBCimp implements LoginJDBC {
    public User user;
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public User LoginJDBCcheck(String username, String password) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_1129", "root", "@@@@@");
            String sql = "select * from t_user where uname=? and pwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setUid(rs.getInt("uid"));
                user.setUname(rs.getString("uname"));
                user.setPwd(rs.getString("pwd"));
            }
        } catch (ClassNotFoundException | SQLException e) {
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
    public User LoginJDBCcheckUID(String uid) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_1129", "root", "@@@@@");
            String sql = "select * from t_user where uid=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(uid));
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setUid(rs.getInt("uid"));
                user.setUname(rs.getString("uname"));
                user.setPwd(rs.getString("pwd"));
            }
        } catch (ClassNotFoundException | SQLException e) {
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
}
