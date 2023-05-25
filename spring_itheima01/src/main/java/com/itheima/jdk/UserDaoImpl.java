package com.itheima.jdk;

import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2021/2/5.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    public void addUser(){
        System.out.println();
        System.out.println("添加用户");
        //int i = 10/0;
    }

    public void deleteUser(){
        System.out.println("删除用户");
    }
}
