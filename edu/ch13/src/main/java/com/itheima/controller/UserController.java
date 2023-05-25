package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 17081290 on 2021/5/10.
 */
@Controller
@RequestMapping(value="/hello")
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println("id="+id);
        return "success";
    }

    @RequestMapping(value="/firstController")
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response, Model model) throws Exception {
        //向模型对象中添加数据
        model.addAttribute("msg","这是我的第一个Spring MVC程序");
        //返回视图页面
        return "first";
    }

}