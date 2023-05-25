package com.msb.service;

import com.msb.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 17081290 on 2020/12/8.
 * 泛型的依赖注入
 */
public class BaseService<T> {
    @Autowired
    BaseDao<T>baseDao;

    public void save(){
        System.out.println("自动注入的对象: "+baseDao);
        baseDao.save();
    }
}
