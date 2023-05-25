package com.msb.service;

import com.msb.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 17081290 on 2020/11/10.
 */

@Service
public class PersonService2 extends PersonService{
    @Autowired
    private PersonDao personDao;


    public void save(){
        System.out.println("--personService2-----------------");
        personDao.save();
    }
}
