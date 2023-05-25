package com.itheima.core.dao;

import com.itheima.core.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 17081290 on 2021/6/1.
 * 用户DAO层接口
 */
public interface UserDao {
    public User findUser(@Param("usercode")String usercode, @Param("password")String password);

}
