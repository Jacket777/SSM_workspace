package com.msb.controller;

import com.msb.dao.PersonDao;
import com.msb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by 17081290 on 2020/12/8.
 */

@Controller
public class PersonController2 {
    //使用@AutoWired进行自动注入
    @Autowired
    @Qualifier("personService")
    private PersonService personServiceExt2;




    public PersonController2(){
        System.out.println("创建对象");
    }




    /**
     * 当方法上有@AutoWired注解时：
     *  1、此方法在bean创建的时候会自动调用
     *  2、这个方法的每一个参数都会自动注入值
     * @param personDao
     */
    @Autowired
    public void test(PersonDao personDao){
        System.out.println("此方法被调用: "+personDao);
    }


    /**
     * @Qualifier注解也可以作用在属性上，用来被当作id去匹配容器中的对象，如果没有
     * 此注解，那么直接按照类型进行匹配
     * @param personService
     */
    @Autowired
    public void test2(@Qualifier("personService")PersonService personService){
        System.out.println("此方法被调用====="+personService);
    }



    public void getPerson(){
        System.out.println("personController..."+personServiceExt2);

        personServiceExt2.getPerson();
    }
}
