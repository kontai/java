package com.tai.LoginService;

import com.tai.User.User;

public interface LoginService {
    public User LoginServiceCheck(String username, String password);

    public User LoginCookieCheck(String uid);
}
