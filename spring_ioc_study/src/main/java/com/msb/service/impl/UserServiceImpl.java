package com.msb.service.impl;

import com.msb.dao.UserDao;
import com.msb.dao.impl.UserDaoImpl;
import com.msb.dao.impl.UserDaoMySqlImp;
import com.msb.service.UserService;

/**
 * Created by 17081290 on 2020/12/3.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;



   // private UserDao userDao = new UserDaoImpl();
   // private UserDao userDao = new UserDaoMySqlImp();
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }



    public void getUser() {
        userDao.getUser();
    }
}
