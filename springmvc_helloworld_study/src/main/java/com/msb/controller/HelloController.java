package com.msb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;


@Controller
public class HelloController {
    /**
     * @RequestMapping 用来匹配当前方法处理的请求，
     * @param map
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Map<String,String>map){
        map.put("hello","hello,springmvc");
        return "hello";
    }
}
