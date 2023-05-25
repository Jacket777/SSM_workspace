package com.msb.controller;

import com.msb.dao.PersonDao;
import com.msb.service.PersonService;
import com.msb.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller
//@Scope(value="prototype")
public class PersonController {
    /**
     * 它是按照什么方式实现自动注入的？
     *默认情况下按照类型进行装配
     * Resource可以完成AutoWired的自动装配功能
     * 但Resource是jdk的 AutoWired是spring
     * Resource可以在其他框架中使用， AutoWired
     */

    //@Resource
    @Autowired
    @Qualifier(value="personService")
    private PersonService personService;

    public PersonController(){
        System.out.println("创建对象");
    }



    public void save(){
        personService.save();
    }

    /**
     * 添加到方法的时候，在创建对象的时候会被调用
     * 同时方法中的参数会进行自动装配
     *
     */

    @Autowired
    public void test(@Qualifier("personDao") PersonDao personDao123){
        System.out.println("test");
        personDao123.update();
    }

}
