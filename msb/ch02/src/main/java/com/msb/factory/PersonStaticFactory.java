package com.msb.factory;

import com.msb.bean.Person;

/**
 * Created by 17081290 on 2021/6/8.
 * 静态工厂类
 */
public class PersonStaticFactory {
    public static Person getPerson(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }
}
