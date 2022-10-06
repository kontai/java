package com.tai.mybatisUtil;

import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import java.io.IOException;

public class myfilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("過濾器啟動");
        SqlSession session=mybatisUtil.getSession();
        chain.doFilter(request,response);
        session.commit();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        mybatisUtil.closeSession();
        Filter.super.destroy();
    }
}
