package com.itheima.core.service;

import com.itheima.core.po.User;

/**
 * Created by 17081290 on 2021/6/1.
 */
public interface UserService {
    //通过账户和密码查询用户
    public User findUser(String usercode, String password);
}
