package com.msb.test;

import com.msb.dao.impl.UserDaoImpl;
import com.msb.dao.impl.UserDaoOracleImpl;
import com.msb.service.UserService;
import com.msb.service.impl.UserServiceImpl;

/**
 * Created by 17081290 on 2021/6/2.
 */
public class SpringDemoTest {
    public static void main(String[] args) {
//        UserService service = new UserServiceImpl();
//        service.getUser();

        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(new UserDaoImpl());
        service.getUser();

        service.setUserDao(new UserDaoOracleImpl());
        service.getUser();
    }
}
