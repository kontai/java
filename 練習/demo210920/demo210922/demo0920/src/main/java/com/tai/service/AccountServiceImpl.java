package com.tai.service;

import com.tai.pojo.Account;
import com.tai.pojo.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class AccountServiceImpl implements AccountService {

    @Override
    public int show(Account accIn, Account accOut) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();

        Account accOutSelect = session.selectOne("com.tai.AccountMapper.selByAccnoPass", accOut);
        if (accOutSelect != null) {
            System.out.println("姓名:" + accOutSelect.getName() + "         存款:" + accOutSelect.getBalance());
            if (accOutSelect.getBalance() >= accOut.getBalance()) {
                Account accInSelect = session.selectOne("com.tai.AccountMapper.selByAccnoName", accIn);
                System.out.println(accIn.getAccno()+" "+accIn.getName());
                if (accInSelect != null) {
                    int index = session.update("com.tai.AccountMapper.UpByAccnoPass", accOut);
                    System.out.print("index="+index+",");
                    index += session.update("com.tai.AccountMapper.UpByAccnoPass", accIn);
                    System.out.println(index);
                    if (index == 2) {
                        Log log=new Log();
                        log.setAccIn(accIn.getAccno());
                        log.setAccOut(accOut.getAccno());
                        log.setMoney(accIn.getBalance());
                        session.insert("com.tai.LogMapper.insLog",log);

                        Logger logger=Logger.getLogger(AccountServiceImpl.class);
                        logger.info(accOut.getAccno()+"給"+accIn.getAccno()+"於"+new Date().toLocaleString()+"轉了"+log.getMoney());
                        session.commit();
                        session.close();
                        return SUCCESS;
                    } else {
                        session.rollback();
                        session.close();
                        return ERROR;
                    }

                } else {
                    System.out.println("收款帳號不存在");
                    return ACCOUT_NOT_EXIST;
                }
            } else {
                return BALANCE_NOT_ENOUGH;
            }
        } else {
            return ACCOUT_NOT_EXIST;
        }

    }
}
