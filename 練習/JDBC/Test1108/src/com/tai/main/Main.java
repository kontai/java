package com.tai.main;

import com.tai.conn.ConnImp;
import com.tai.user.User;

import java.util.ArrayList;

/**
 * @author kontai
 */
public class Main {
    public static void main(String[] args)
    {
//        int ret=new ConnImp().getUpdate();
//        System.out.println("一共更新"+ret+"個數據.");
        ArrayList<User> query=new ConnImp().getQuery();
        for(User user:query){
            System.out.println("EID:"+user.getEid()+"\tEname:"+user.getEname()+"\tEage:"+user.getEage());
        }
    }

}
