package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2021/1/19.
 */
@Controller

public class BDOPSController {

    @RequestMapping("/AsyncCreateAccount")
    public String testAsyncCreateAccount(@RequestBody String body){
        System.out.println("===>>>>>>>>>"+body+">>>>>>=====");
        return "bdops";
    }
}
