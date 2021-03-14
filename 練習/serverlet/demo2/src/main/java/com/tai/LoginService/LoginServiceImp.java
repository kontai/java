package com.tai.LoginService;

import com.tai.User.User;

/**
 * @author kontai
 */
public class LoginServiceImp implements LoginService{
    @Override
    public User LoginServiceCheck(String username, String password) {
    LoginJDBC l=new LoginJDBCimp();
        return l.LoginJDBCcheck(username,password);
    }

    @Override
    public User LoginCookieCheck(String uid) {
        LoginJDBC c=new LoginJDBCimp();
        return c.LoginJDBCcheckUID(uid);
    }
}
