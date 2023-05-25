package com.msb.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/11/10.
 */

public abstract class BaseDao<T> {
    public abstract void save();
}
