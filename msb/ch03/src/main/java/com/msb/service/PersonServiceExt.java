package com.msb.service;

import com.msb.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 17081290 on 2021/6/10.
 */
@Service
public class PersonServiceExt extends PersonService {
    @Autowired
    private PersonDao personDao;
    public void getPerson(){
        System.out.println("PersonServiceExt.....");
        personDao.getPerson();
    }
}
