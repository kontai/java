package com.tai.JDBC;

import com.tai.User.User;

public interface LoginService {
     public User LoginCheckJDBC(String uname, String password);

   public  User uidCheck(String uid);
}
