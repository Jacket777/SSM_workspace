package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2021/1/4.
 * 测试拦截器
 */
@Controller
public class InterceptorController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
       // int i  = 1/0;
        System.out.println(this.getClass().getName());
        return "success";
    }

    /**
     * 测试执行异常
     * @return
     */
    @RequestMapping("/testInterceptor2")
    public String testInterceptor2(){
        int i  = 1/0;
        System.out.println(this.getClass().getName());
        return "success";
    }

}
