package com.itheima.controller;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 17081290 on 2020/12/14.
 */

/**
 * 控制器类
 */
public class FirstController implements Controller{
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //1.创建ModelAndView对象
        ModelAndView mav = new ModelAndView();
        //2.向模型对象中添加数据
        mav.addObject("msg","这是第一个Spring MVC程序");
        //3.设置逻辑视图名
        mav.setViewName("first");
        return mav;
    }

}
