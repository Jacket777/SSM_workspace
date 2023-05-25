package com.itheima.controller;


import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2021/4/26.
 * 控制器类
 */
@Controller
@RequestMapping(value="/hello")
public class FirstController{
    @RequestMapping(value="/firstController")
    public String handleRequest(HttpServletRequest request,
                                      HttpServletResponse response,Model model) throws Exception {
        //向模型对象中添加数据
        model.addAttribute("msg","这是我的第一个Spring MVC程序");
        //返回视图页面
        return "first";
    }

    @RequestMapping("/selectUser")
    public String selectUser(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println("id="+id);
        return "success";
    }


}