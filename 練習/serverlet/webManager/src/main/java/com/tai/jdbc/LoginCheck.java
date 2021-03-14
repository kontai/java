package com.tai.jdbc;

import com.tai.User.User;

public interface LoginCheck {
    public User checkLogin(String uname, String pwd);
}
