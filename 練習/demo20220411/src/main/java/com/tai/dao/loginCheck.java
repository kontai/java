package com.tai.dao;

public interface loginCheck {

     User checkUser(String uname,String pwd);

     User checkUserWithAID(String aid);
}
