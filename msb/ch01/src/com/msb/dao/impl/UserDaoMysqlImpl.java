package com.msb.dao.impl;

import com.msb.dao.UserDao;

/**
 * Created by 17081290 on 2021/6/2.
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("mysql");
    }
}
