package com.itheima.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 17081290 on 2021/1/29.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource(name="userDao")
    private UserDao userDao;


    public void save() {
        //调用userDao中的save方法
        this.userDao.save();
        System.out.println("userservice.......save...");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
