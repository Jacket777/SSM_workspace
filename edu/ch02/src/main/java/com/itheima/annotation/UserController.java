package com.itheima.annotation;


import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by 17081290 on 2021/2/4.
 */
@Controller("userController")
public class UserController {
    @Resource(name="userService")

    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("userController.....save...");
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
