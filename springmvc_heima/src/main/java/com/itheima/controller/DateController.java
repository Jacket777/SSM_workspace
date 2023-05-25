package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by 17081290 on 2020/12/15.
 * 日期控制器类
 */
@Controller
public class DateController {
    /**
     * 使用自定义类型数据绑定日期数据
     * @param date
     * @return
     */
    @RequestMapping("/customDate")
    public String CustomDate(Date date){
        System.out.println("date = "+date);
        return "success";

    }

}
