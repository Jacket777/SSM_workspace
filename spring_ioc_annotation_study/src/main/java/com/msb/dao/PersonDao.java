package com.msb.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/12/8.
 */
@Repository("personDao")
@Scope(value="prototype")
public class PersonDao {
    public PersonDao(){
        System.out.println("创建personDao对象");
    }


    public void getPerson(){
        System.out.println("PersonDao:getPerson");
    }
}
