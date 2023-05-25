package com.msb.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 17081290 on 2020/12/10.
 */
public class HelloContrller implements Controller{
    public ModelAndView handleRequest( HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("----"+this.getClass().getName());
        //1.创建对象
        ModelAndView mv = new ModelAndView();
        //2.添加视图名称，要跳转的页面名称
        //补充说明：名称为jsp的名称，与之对应的是test.jsp
        mv.setViewName("test");
        //3.向前端页面添加属性值---前端的页面中有变量hello，设定其值为hello springmvc
        mv.addObject("hello","hello springmvc");
        return mv;
    }
}
