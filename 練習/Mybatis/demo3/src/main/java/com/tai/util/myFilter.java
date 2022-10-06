package com.tai.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;

public class myFilter implements Filter {



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
        System.out.println("filter init()執行");

    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter foFilter()執行");

        
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        chain.doFilter(request,response);

        SqlSession session=MybatisUtil.getSqlSession();
        try{
            chain.doFilter(request,response);
            session.commit();
        }catch (Exception e){
            session.rollback();
//            e.printStackTrace();
            Logger logger = null;
            logger.debug("error");
        }finally {
            MybatisUtil.closeSqlSession();
        }

        System.out.println("filter foFilter()調回");
    }

    @Override
    public void destroy() {
//        Filter.super.destroy();
        System.out.println("filter destroy()執行");
    }
}
