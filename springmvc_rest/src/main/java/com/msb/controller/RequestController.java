package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 17081290 on 2020/12/25.
 */
@Controller
public class RequestController {


    /*
    原来的方式
    request.getParameter("name")
    当请求找到对应的处理方法之后，会根据参数名称从request中获取对应的参数值，并封装到方法中，
    此时要求，方法的名称和url中参数的名字必须一致，如果不一致，设置不成功

    如果设置的值不同，同时又想让参数获取到对应的属性值，可以通过@RequestParam来使用
    经常跟@PathVariable混淆，注意两个不同点
    注解的参数：
    value:获取的参数值
    required:表示当前属性值是否必须存在的，默认值是true，表示请求中必须包含此参数，如果没有则报错400，bad request
    defaultValue:如果传递参数，则使用，不传则使用默认值

     */
//    @RequestMapping("/testRequest")
//    public String testRequest(String name){
//        System.out.println(name);
//        return "success";
//    }


//    @RequestMapping("/testRequest")
//    public String testRequest(@RequestParam("username") String name){
//        System.out.println(name);
//        return "success";
//    }

//    @RequestMapping("/testRequest")
//    public String testRequest(@RequestParam(value="username",required = false) String name){
//        System.out.println(name);
//        return "success";
//    }

    @RequestMapping("/testRequest")
    public String testRequest(@RequestParam(value="username",required = false,defaultValue = "lisi") String name){
        System.out.println(name);
        return "success";
    }

    /**
     * 获取请求头信息:
     * 通过@RequestHeader注解来表示
     * @return
     * 老方法:request.getHeader("User-Agent")
     * 同时也包含了几个参数
     * value:
     * required
     * defaultValue
     * 同@RequestParam
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("User-Agent") String userAgent){
        System.out.println(userAgent);
        return "success";
    }


    /**
     * 获取cookie中的值
     * 使用 Cookie[]cookie = request.getCookies()
     * @param jsid
     * cookieValue 参数如上所示
     * @return
     */
    @RequestMapping("/testCookie")
    public String testCookie(@CookieValue("JSESSIONID") String jsid){
        System.out.println(jsid);
        return "success";
    }


}
