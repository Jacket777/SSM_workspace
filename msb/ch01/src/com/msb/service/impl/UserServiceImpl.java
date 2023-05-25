package com.msb.service.impl;

import com.msb.dao.UserDao;
import com.msb.dao.impl.UserDaoImpl;
import com.msb.dao.impl.UserDaoMysqlImpl;
import com.msb.service.UserService;

/**
 * Created by 17081290 on 2021/6/2.
 */
public class UserServiceImpl implements UserService {
//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }


}
