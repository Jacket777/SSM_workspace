package com.msb.service;

import com.msb.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 17081290 on 2021/6/10.
 */
public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;

    public void save(){
        System.out.println("自动注入的对象："+baseDao.getClass().getName());
        baseDao.save();
    }
}
