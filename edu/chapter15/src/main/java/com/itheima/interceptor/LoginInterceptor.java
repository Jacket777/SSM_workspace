package com.itheima.interceptor;

import com.itheima.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by 17081290 on 2021/5/14.
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        //获取请求URL
        String url = request.getRequestURI();
        //URL:除了login.jsp可以是公开访问的，其他URL都进行拦截控制
        if(url.indexOf("/login")>=0){
            return true;
        }
        //获取session
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER_SESSION");
        //判断Session是否有用户数据，如果有，则返回true,继续向下执行
        if(user!=null){
            return true;
        }
        //不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("msg","你还没有登录，请先登录!");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        //System.out.println("CustomerInterceptor.....post");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {
        //System.out.println("CustomerInterceptor.....afterCompletion");
    }
}
