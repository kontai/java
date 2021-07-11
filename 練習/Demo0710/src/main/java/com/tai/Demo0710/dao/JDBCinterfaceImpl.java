package com.tai.Demo0710.dao;

import com.tai.Demo0710.User.User;

import java.sql.*;


public class JDBCinterfaceImpl implements JDBCinterface {
    @Override
    public User chekUser(String username, String password) {
        User user = null;
        String driver = "com.mysql.jdbc.Driver";
        //載入驅動
        try {
            Class.forName(driver);
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("can't find driver " + driver);
            e.printStackTrace();
        }

        //mysql database
        String database = "webdb";
        //mysql table name
        String db_name = "t_user";
        //mysql user info
        String db_username = "root";
        String db_pass = "@@@@@";
        String url = "jdbc:mysql://localhost:3306/";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            conn = DriverManager.getConnection(url + database, db_username, db_pass);
            System.out.println("成功連接資料庫");

            ps = conn.prepareStatement("select * from " + db_name + "  where uname=? and pwd=?");
            ps.setString(1, username);
            ps.setString(2, password);
            res = ps.executeQuery();
            if (res.next()) {
                int uid = res.getInt("uid");
                String uname = res.getString("uname");
                String pass = res.getString("pwd");
                user = new User(uname, pass);
                user.setUid(uid);
                System.out.println("user name="+uname+",password="+pass);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


        return user;
    }
}
