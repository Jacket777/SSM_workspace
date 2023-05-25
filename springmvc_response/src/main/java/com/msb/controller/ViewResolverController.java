package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2020/12/28.
 */

@Controller
public class ViewResolverController {
    @RequestMapping(value="/msb")
    public String testView(){
        System.out.println("testView");
        return "msb:/index";
    }

    @RequestMapping("/msb2")
    public String testView2(){
        System.out.println("testView");
        return "heihei:/index";
    }

}
