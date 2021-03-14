package com.tai.jdbc;

import com.tai.User.User;

import java.sql.*;

public class LoginCheckImp implements LoginCheck {
    @Override
    public User checkLogin(String uname, String pwd) {
        User u = null;
        //創建連接對象
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //加載驅動
            Class.forName("com.mysql.jdbc.Driver");
            //建立連接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebdb", "root", "@@@@@");
            System.out.println("已成功建立連接~");
            //創建SQL查詢語句\
            String sql = "select * from t_user where uname=? and pwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,uname);
            ps.setString(2,pwd);
            rs=ps.executeQuery();
            if(rs.next()){
                String username=rs.getString("uname");
                String password=rs.getString("pwd");
                u=new User(username,password);
                System.out.println("user="+username+",paswword="+password);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        return u;
    }
}
