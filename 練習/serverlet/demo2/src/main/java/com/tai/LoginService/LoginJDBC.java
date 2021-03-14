package com.tai.LoginService;

import com.tai.User.User;

public interface LoginJDBC {
    public User LoginJDBCcheck(String username,String password);

    User LoginJDBCcheckUID(String uid);
}
