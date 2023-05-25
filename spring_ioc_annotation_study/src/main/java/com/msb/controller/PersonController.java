package com.msb.controller;

import com.msb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 17081290 on 2020/12/8.
 */

@Controller
public class PersonController {
    //使用@AutoWired进行自动注入
    @Autowired
    private PersonService personService;




    public PersonController(){
        System.out.println("创建对象");
    }



    public void getPerson(){
        personService.getPerson();
    }
}
