package com.tai.JDBC;

import com.tai.User.User;
import org.apache.log4j.Logger;

import java.sql.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class LoginCheckImp implements LoginService {
    @Override
    public User LoginCheckJDBC(String uname, String password) {

        User user = null;
        //Create Object
        Properties props = new Properties();
        //Create Stream
        InputStream ins = null;
        try {
            ins = this.getClass().getResourceAsStream("jdbc.properties");
//            ins = new FileInputStream("D:\\workspace\\JAVA\\練習\\serverlet\\WebLoginDemo\\src\\main\\java\\com\\tai\\JDBC\\jdbc.properties");
            //load Stream
            props.load(ins);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = props.getProperty("driver");
        String url = props.getProperty("url");
        String userName = props.getProperty("uname");
        String passWord = props.getProperty("pwd");
        System.out.println("driver=" + driver + ",url=" + url);
        System.out.println("userName=" + userName + ",passWord=" + passWord);

        Connection conn = null;
        PreparedStatement pps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(url, userName, passWord);
            String sql = "select * from t_user where uname=? and pwd=?";
            pps = conn.prepareStatement(sql);
            pps.setString(1, uname);
            pps.setString(2, password);
            rs = pps.executeQuery();
            if (rs.next()) {
                int uid = rs.getInt("uid");
                System.out.println("LoginCheckImp getUid=" + uid);
                String Uname = rs.getString("uname");
                String pass = rs.getString("pwd");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                Date birth = rs.getDate("birth");
                user = new User(uid, Uname, pass, sex, age, birth);
                Logger logger=Logger.getLogger(this.getClass().getName());
                logger.debug("LoginCheckImp getUid=" + uid);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            pps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ins.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return user;
    }

    @Override
    public User uidCheck(String UID) {
        User user = null;
        //Create Object
        Properties props = new Properties();
        //Create Stream
        InputStream ins = null;
        try {

            ins = this.getClass().getResourceAsStream("jdbc.properties");
//            ins = new FileInputStream("D:\\workspace\\JAVA\\練習\\serverlet\\WebLoginDemo\\src\\main\\java\\com\\tai\\JDBC\\jdbc.properties");
            //load Stream
            props.load(ins);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = props.getProperty("driver");
        String url = props.getProperty("url");
        String userName = props.getProperty("uname");
        String passWord = props.getProperty("pwd");
        System.out.println("driver=" + driver + ",url=" + url);
        System.out.println("userName=" + userName + ",passWord=" + passWord);

        Connection conn = null;
        PreparedStatement pps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(url, userName, passWord);
            String sql = "select * from t_user where uid=? ";
            pps = conn.prepareStatement(sql);
            pps.setString(1, UID);
            rs = pps.executeQuery();
            if (rs.next()) {
                int uid = rs.getInt("uid");
                System.out.println("UID \"" + uid + "\" is found!");
                String Uname = rs.getString("uname");
                String pass = rs.getString("pwd");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                Date birth = rs.getDate("birth");
                user = new User(uid, Uname, pass, sex, age, birth);
            } else {
                System.out.println("Uid not found");
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            pps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ins.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
