package com.msb.controller;

import com.msb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by 17081290 on 2020/12/26.
 * SessionAttribute要注意，在使用的时候，如果没有对应的值，会报异常
 * 在使用@ModelAttribute的时候，需要注意
 * 如果参数中国注解中没有写名字的话，默认使用参数名称的首字母小写字母匹配
 * 如果有值，直接返回，如果没有值会去session进行查找也就是会判断当前类中是否添加过@SessionAttribute
 * 推荐注解中添加参数来作为标识，进行对象的赋值
 */
@Controller
@SessionAttributes("user")
public class UserController {
    Object o1 = null;
    Object o2 = null;
    Model m1 = null;


//    @RequestMapping("/update")
//    public String update(User user){
//        System.out.println(user);
//        return "success";
//    }


//    @RequestMapping("/update")
//    public String update(@ModelAttribute("user") User user){
//        o1 = user;
//        System.out.println(user);
//        System.out.println(o1 == o2);
//        return "success";
//    }
//
//
//
//    @ModelAttribute
//    public void testModelAttribute(Model model){
//        System.out.println("testModelAttribute------------------");
//        User user = new User();
//        o2 = user;
//        user.setId(1);
//        user.setName("李四");
//        user.setPassword("1234");
//        model.addAttribute("user",user);
//    }




//    @RequestMapping("/update")
//    public String update(@ModelAttribute("user2") User user){
//        System.out.println("update---------");
//        o2 = user;
//        System.out.println(user);
//        System.out.println(o1 == o2);
//        return "success";
//    }
//
//
//    @ModelAttribute
//    public void testModelAttribute(Model model){
//       //先执行
//        System.out.println("testModelAttribute------------------");
//        User user = new User();
//        //如果表单里面有数据，则覆盖里面的数据
//        user.setId(1);
//        user.setName("李四");
//        user.setPassword("1234");
//        model.addAttribute("user2",user);
//        o1 = user;
//    }


//测试model是否一致
    @RequestMapping("/update")
    public String update(@ModelAttribute("user") User user,Model model){
        System.out.println("update---------");
        o2 = user;
        System.out.println(user);
        System.out.println(o1 == o2);
        System.out.println(m1 == model);
        return "success";
    }


    //测试model
//    @ModelAttribute
//    public void testModelAttribute(Model model){
//        //先执行
//        System.out.println("testModelAttribute------------------");
//        User user = new User();
//        //如果表单里面有数据，则覆盖里面的数据
//        user.setId(1);
//        user.setName("李四");
//        user.setPassword("1234");
//        model.addAttribute("user",user);
//        o1 = user;
//        m1 = model;
//    }


    //测试不管是任何请求，都会执行带该@ModelAttribute注释的方法
//    @ModelAttribute
//    public void testModelAttribute2(Model model){
//        //测试是否执行
//        System.out.println("testModelAttribute--测试是否执行----------------");
//
//    }






    @RequestMapping("/update2")
    public String update2(){
        System.out.println("update2------测试-------------------------");
        return "success";
    }


    //
//    @ModelAttribute
//    public void testModelAttribute2(Model model){
//        //测试是否执行
//        System.out.println("testModelAttribute--测试是否执行----------------");
//        //测试是否设置值成功
//        User user = new User();
//        user.setName("王五");
//        model.addAttribute("user",user);
//
//    }


    @ModelAttribute("user")
    public User testModelAttribute3(){
        System.out.println("testModelAttribute3-------------------");
        User user = new User();
        user.setId(1);
        user.setName("李四");
        user.setAge(11);
        user.setPassword("1234");
        o1 = user;
        return user;
    }


//   @RequestMapping("/update")
//    public String update(@ModelAttribute("user2")User user, Model model){
//       System.out.println("update------------------------------------");
//       o2 = user;
//       System.out.println(user);
//       System.out.println(o1 == o2);
//       System.out.println(m1 = model);
//       return "success";
//    }





//    @ModelAttribute
//    public void testModelAttribute(Model model){
//        System.out.println("testModelAttribute------------------");
//        User user = new User();
//        user.setId(1);
//        user.setName("李四");
//        user.setPassword("1234");
//        model.addAttribute("user",user);
//        o1 = user;
//        m1 = model;
//    }


//    @ModelAttribute
//    public void testModelAttribute2(Model model){
//        System.out.println("testModelAttribute2-------------------");
//        User user = new User();
//        user.setName("王五");
//        model.addAttribute("user", user);
//    }


//    @ModelAttribute("user2")
//    public User testModelAttribute3(){
//        System.out.println("testModelAttribute3-------------------");
//        User user = new User();
//        user.setId(1);
//        user.setName("李四");
//        user.setAge(11);
//        user.setPassword("1234");
//        o1 = user;
//        return user;
//    }




}
