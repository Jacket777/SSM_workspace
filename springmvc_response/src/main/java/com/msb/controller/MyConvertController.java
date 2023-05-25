package com.msb.controller;

import com.msb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2020/12/29.
 */
@Controller
public class MyConvertController {
    @RequestMapping("/converter")
    public String testConverter(User user,Model model){

        System.out.println(user);
        model.addAttribute("user",user);
        return "success";


    }


}
