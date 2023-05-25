package com.msb.controller;

import com.msb.bean.User;
import com.msb.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 17081290 on 2020/12/23.
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    //@RequestMapping("/save")
    @RequestMapping(value="/user",method= RequestMethod.POST)
    public String save() {
        System.out.println(this.getClass().getName() + " save");
        userDao.save(new User());
        return "success";
    }

    //@RequestMapping("/update")
    @RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
    public String update(@PathVariable("id") Integer id) {
        System.out.println(this.getClass().getName() + " update"+" "+id);
        userDao.update(id);
        return "success";
    }


   // @RequestMapping("/delete")
   @RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id) {
        System.out.println(this.getClass().getName() + " delete"+" "+id);
        userDao.delete(id);
        return "success";
    }


    //@RequestMapping("/query")
    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
    public String querey(@PathVariable("id") Integer id) {
        System.out.println(this.getClass().getName() + " query"+" "+id);
        userDao.query();
        return "success";
    }


}

