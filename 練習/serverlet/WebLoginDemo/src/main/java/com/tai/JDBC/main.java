package com.tai.JDBC;

import com.tai.User.User;

public class main {
    public static void main(String[] args) {
        LoginService ls = new LoginCheckImp();
        User user = null;
        try {
            user = ls.LoginCheckJDBC("kontai", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(user!=null){
            System.out.println(user);
        }

    }
}
