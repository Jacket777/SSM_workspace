package com.msb.service;

import com.msb.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 17081290 on 2020/12/8.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public PersonService(){
        System.out.println("创建personservice 对象");
    }

    public void getPerson(){
        personDao.getPerson();
    }
}
