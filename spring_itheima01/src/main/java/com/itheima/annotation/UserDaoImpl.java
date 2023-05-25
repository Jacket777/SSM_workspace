package com.itheima.annotation;

import org.springframework.stereotype.Repository;
//
///**
// * Created by 17081290 on 2021/1/29.
// */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
public void save() {
  System.out.println("userdao....save...");}
}
