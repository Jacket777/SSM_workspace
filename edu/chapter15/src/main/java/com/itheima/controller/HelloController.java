package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2021/5/14.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("hello world!");
        return "success";
    }
}
