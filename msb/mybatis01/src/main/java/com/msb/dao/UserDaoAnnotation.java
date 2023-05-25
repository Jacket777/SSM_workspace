package com.msb.dao;

import com.msb.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 17081290 on 2021/1/7.
 */
public interface UserDaoAnnotation {

    @Select("select * from user where id = #{id}")
    public User selectUserById(Integer id);
}
