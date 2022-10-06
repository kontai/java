package com.tai.filter;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import java.io.IOException;
import java.io.InputStream;

public class MyFilter implements Filter {
    private SqlSession session;
    private ThreadLocal<SqlSession> tc;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("過濾器啟動");
        try {
            InputStream in = Resources.getResourceAsStream("mybatis");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            session = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        static{
//            tc = new ThreadLocal();
//            tc.set(session);
//        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
