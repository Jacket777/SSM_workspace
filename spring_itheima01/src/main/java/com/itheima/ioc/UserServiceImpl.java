package com.itheima.ioc;

/**
 * Created by 17081290 on 2021/1/28.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void say(){
        this.userDao.say();
        System.out.println("userService say hello world!");
    }

}
