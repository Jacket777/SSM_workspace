package com.itheima.controller;

import com.itheima.po.Orders;
import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 17081290 on 2021/5/11.
 * 订单控制器类
 */
@Controller
public class OrdersController {
    /**
     * 向订单查询页面跳转
     */
    @RequestMapping(value="/tofindOrdersWithUser")
    public String tofindOrdersWithUser(){
        return "orders";
    }

    @RequestMapping(value="/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer ordersId = orders.getOrdersId();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("orderId = "+ordersId);
        System.out.println("username = "+username);
        return "success";
    }


}
