package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2020/12/26.
 */
@Controller
public class StaticController {
    @RequestMapping("/static")
    public String testStatic(){
        System.out.println("static");
        return "forward:/index.jsp";
    }


//    @RequestMapping("/static")
//    public String testStatic(){
//        System.out.println("static");
//        return "msb:success";
//    }



}
