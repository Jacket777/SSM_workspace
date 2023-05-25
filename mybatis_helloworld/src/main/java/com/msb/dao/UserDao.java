package com.msb.dao;

import com.msb.bean.User;

/**
 * Created by 17081290 on 2021/1/7.
 */
public interface UserDao {
    public User selectUserById(Integer id);
}
