package com.msb.factory;

import com.msb.bean.Person;

/**
 * Created by 17081290 on 2020/11/3.
 */
public class PersonStaticFactory {
    public static Person getPerson(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }
}
