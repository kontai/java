package com.tai.service;


import com.tai.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class AccountServiceImpl implements AccountService {
    @Override
    public Account show(String no, int pass) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();



        Account acc=new Account();
        acc.setAccno(no);
        acc.setPassword(pass);

        Account account = session.selectOne("com.tai.AccountMapper.selByAccNoPwd",acc);
        if(account!=null){
            System.out.println(account);
        }

        return account;
    }
}
