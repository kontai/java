package com.tai.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class myFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("過濾器1啟動");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //放行
        HttpSession hs=((HttpServletRequest)request).getSession();
        if(hs.getAttribute("user")==null) {
            ((HttpServletResponse) response).sendRedirect("/a/login.jsp");
        }else {
            chain.doFilter(request,response);
        }
        chain.doFilter(request,response);
        System.out.println("過濾器執行");

    }

    @Override
    public void destroy() {
        System.out.println("過濾器1銷毀");
        Filter.super.destroy();
    }
}
