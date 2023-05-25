package com.msb;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 17081290 on 2020/12/24.
 */
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ");

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器开始执行.....");
        System.out.println(this.getClass().getName()+"-------start");
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println(this.getClass().getName()+"-------stop");
    }

    public void destroy() {
        System.out.println("destory");
    }
}
