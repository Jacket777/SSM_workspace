package com.itheima.controller;

import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 接受RESTful风格的请求，其接受方式为GET
     * @return
     */
    @RequestMapping(value="/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@PathVariable("id")String id){
        //查看数据接受
        System.out.println("id = "+id);
        User user = new User();
        //模拟根据id查询出用户对象数据
        if(id.equals("1234")){
            System.out.println("========");
            user.setUsername("tom");
        }
        //返回JSON格式数据
        return user;
    }
}
