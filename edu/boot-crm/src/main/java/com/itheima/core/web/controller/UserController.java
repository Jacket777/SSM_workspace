package com.itheima.core.web.controller;
import com.itheima.core.po.User;
import com.itheima.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by 17081290 on 2021/6/1.
 * 用户控制器类
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 用户登录
     */
    @RequestMapping(value="/login.action", method= RequestMethod.POST)
    public String login(String usercode, String password, Model model, HttpSession session){
        //通过账户和密码查询用户
        User user = userService.findUser(usercode,password);
        if(user!=null){
            //将用户对象添加到Session
            session.setAttribute("USER_SESSION",user);
            //跳转到主页面
            return "customer";
        }

        model.addAttribute("msg","账户或密码错误，请重新输入");
        //返回登录页面
        return "login";
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    public String logout(HttpSession session){
        //清除session
        session.invalidate();
        //重定向到登录页面的跳转方法
        return "redirect:login.action";

    }

    /**
     * 向用户登录页面跳转
     * @return
     */
    @RequestMapping(value="/login.action",method=RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
}
