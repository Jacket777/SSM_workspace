package com.itheima.controller;

import com.itheima.po.User;
import com.itheima.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * Created by 17081290 on 2020/12/14.
 * 测试数据绑定
 */
@Controller
public class UserController {
    /**
     * 使用说明：使用默认的HttpServletRequest参数类型已经完成了数据绑定

     */
//    @RequestMapping("/selectUser")
//    public String selectUser(HttpServletRequest request){
//        String id = request.getParameter("id");
//        System.out.println("id = "+id);
//        return "success";
//    }



//    @RequestMapping("/selectUser")
//    public String selectUser(Integer id){
//        System.out.println("id = "+id);
//        return "success";
//    }


//    @RequestMapping("/selectUser")
//    public String selectUser(Integer id){
//        System.out.println("id = "+id);
//        return "success";
//    }


    @RequestMapping("/selectUser")
    public String selectUser(@RequestParam(value="user_id")Integer id){
        System.out.println("id = "+id);
        return "success";
    }


    /**
     * 向用户注册页面跳转
     * @return
     */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }


    /**
     * 接收用户注册信息
     * @param user
     * @return
     */
    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("username = "+username);
        System.out.println("password = "+password);
        return "success";

    }


    /**
     * 向用户列表页面跳转
     * @return
     */
    @RequestMapping("/toUser")
    public String selectUsers(){
        return "user";
    }


    /**
     * 接受批量删除用户的方法
     * @param ids
     * @return
     */
    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[]ids){
        if(ids!=null){
            for (Integer id:ids) {
                //使用输出语句模拟已经删除的用户
                System.out.println("删除了 id 为 "+id+" 的用户");
            }
        }else{
            System.out.println("ids = null");
        }
        return "success";
    }


    /**
     * 向用户批量修改页面跳转
     * @return
     */
    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }


    @RequestMapping("/editUsers")
    public String editUsers(UserVO userList){
        //将所有用户封装到集合中
        List<User> users = userList.getUsers();
        //循环输出所有用户信息
        for (User user:users) {
            //如果接收的用户id不为空，则表示对用户进行了修改
            if(user.getId()!=null){
                System.out.println("修改了id为 "+user.getId()+" 的用户名为："+user.getUsername());
            }
        }
        return "success";
    }






}
