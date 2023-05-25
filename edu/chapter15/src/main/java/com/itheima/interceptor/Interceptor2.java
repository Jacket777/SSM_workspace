package com.itheima.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 17081290 on 2021/5/14.
 * 实现了HnadlerInterceptor接口的自定义拦截器类
 */
public class Interceptor2 implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("Interceptor2.....preHandle");
        return true;}

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                    ModelAndView modelAndView) throws Exception {
        System.out.println("Interceptor2.....post");}

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                          Exception ex) throws Exception {
        System.out.println("Interceptor2.....afterCompletion");}
}