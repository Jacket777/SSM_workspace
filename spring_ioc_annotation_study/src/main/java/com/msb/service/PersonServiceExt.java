package com.msb.service;

import com.msb.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 17081290 on 2020/12/8.
 */
public class PersonServiceExt extends PersonService{
    @Autowired
    private PersonDao personDao;

    public void getPerson(){
        System.out.println("PersonServiceExt......");
        personDao.getPerson();
    }
}
