package com.tai.service.Impl;

import com.tai.dao.User;
import com.tai.dao.impl.loginCheckImp;
import com.tai.dao.loginCheck;
import com.tai.service.UserService;

public class UserServiceImpl implements UserService {
    loginCheck lc=new loginCheckImp();

    @Override
    public User show(String name,String password) {
        User user=null;
        user=lc.checkUser(name,password);


        return user;
    }
}
