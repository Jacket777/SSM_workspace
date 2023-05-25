package com.itheima.controller;

import com.itheima.po.Orders;
import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2020/12/15.
 */
@Controller
public class OrdersController {

    /**
     * 向订单查询页面跳转
     * @return
     */
    @RequestMapping("/tofindOrdersWithUser")
    public String tofindOrdersWithUser(){
        return "orders";
    }


    /**
     * 查询订单和用户信息
     * @param orders
     * @return
     */
    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer orderId = orders.getOrdersId();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("orderId = "+orderId);
        System.out.println("username = "+username);
        return "success";
    }




}
