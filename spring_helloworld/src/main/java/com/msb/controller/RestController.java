package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 17081290 on 2020/12/14.
 */
@Controller
public class RestController {

    @RequestMapping(value="/user",method= RequestMethod.POST)
    public String add(){
        System.out.println("成功");
        return "success";
    }


    @RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable("id")Integer id){
        System.out.println("删除: "+id);
        return "success";
    }


    @RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
    public String update(@PathVariable("id")Integer id){
        System.out.println("更新: "+id);
        return "success";
    }


    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
    public String query(@PathVariable("id")Integer id){
        System.out.println("查询: "+id);
        return "success";
    }

}
