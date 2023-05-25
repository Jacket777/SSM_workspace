package com.itheima.controller;

import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 17081290 on 2021/5/11.
 */
@Controller
public class UserController {
    @RequestMapping(value = "/testJson", method = RequestMethod.POST)
    @ResponseBody
    public User testJson(@RequestBody User user){
        //打印接收的JSON格式数据
        System.out.println(user);
        //返回JSON格式的响应
        return user;
    }
}
