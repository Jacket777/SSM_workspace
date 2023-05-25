package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




/**
 * Created by 17081290 on 2020/12/14.
 */

/**
 * 控制器类--使用注解
 */

@Controller
@RequestMapping("/msb")
public class SecondController {
    @RequestMapping("/testAnonation")
    public String handleRequest(Model model)  {
        //1.向模型对象中添加数据
        model.addAttribute("msg","测试返回String对象，不添加视图解析器属性");
        //return "/WEB-INF/page/t3.jsp"; //不添加注解时使用
        return "t3";
    }

}
