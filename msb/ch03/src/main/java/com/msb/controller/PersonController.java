package com.msb.controller;
import com.msb.dao.PersonDao;
import com.msb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class PersonController {
    //@Autowired
    @Qualifier("personService")
    @Resource
    private PersonService personServiceExt2;

    public PersonController(){
        System.out.println("创建对象");
    }

    public void getPerson(){
        System.out.println("personController....."+personServiceExt2);
        //personServiceExt2.getPerson();
    }

    /**
     * 当方法上有@AutoWired注解时：
     *  1、此方法在bean创建的时候会自动调用
     *  2、这个方法的每一个参数都会自动注入值
     * @param personDao
     */
//    @Autowired
//    public void test(PersonDao personDao){
//        System.out.println("test方法被调用: ");
//        personDao.getPerson();
//
//    }

//    @Autowired
//    public void test2(@Qualifier("personServiceExt")PersonService personService){
//        System.out.println("test2方法被调用：");
//        personService.getPerson();
//    }
}