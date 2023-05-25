package com.msb.controller;

import com.msb.bean.User;
import com.msb.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 17081290 on 2020/12/15.
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value="/user",method= RequestMethod.POST)
    public String save(){
        System.out.println(this.getClass().getName()+" save");
        userDao.save(new User());
        return "success";

    }


    @RequestMapping(value="/user",method= RequestMethod.PUT)
    public String update(Integer id){
        System.out.println(this.getClass().getName()+" update");
        userDao.update(id);
        return "success";
    }


    @RequestMapping(value="/user",method= RequestMethod.DELETE)
    public String delete(Integer id){
        System.out.println(this.getClass().getName()+" delete");
        userDao.delete(id);
        return "success";
    }


    @RequestMapping(value="/user",method= RequestMethod.GET)
    public String query( ){
        System.out.println(this.getClass().getName()+" query");
        userDao.query();
        return "success";
    }



}
