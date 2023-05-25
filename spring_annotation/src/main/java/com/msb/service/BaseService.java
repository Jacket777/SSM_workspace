package com.msb.service;

import com.msb.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 17081290 on 2020/11/11.
 */
//@Service
public class BaseService <T>{
    @Autowired
    private BaseDao<T> baseDao;

    public void save(){
        baseDao.save();
    }
}
