package com.itheima.core.service.impl;

import com.itheima.core.dao.UserDao;
import com.itheima.core.po.User;
import com.itheima.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 17081290 on 2021/6/1.
 * 用户Service接口实现类
 *
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public User findUser(String usercode, String password) {
        User user = this.userDao.findUser(usercode,password);
        return user;
    }
}
