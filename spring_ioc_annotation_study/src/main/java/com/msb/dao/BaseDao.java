package com.msb.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/12/8.
 */
@Repository
public abstract class BaseDao <T>{
    public abstract void save();
}
