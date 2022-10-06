package com.tai.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class testFilter {
    private static SqlSession session;
    private  ThreadLocal<SqlSession> tc;

    public static void main(String[] args) {
        static{
            try {
                InputStream in=Resources.getResourceAsStream("mybtais.xml");
                SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
                session=factory.openSession();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        tc.set(session);

    }
}
