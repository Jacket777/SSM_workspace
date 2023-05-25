package com.itheima.aspect;

/**
 * Created by 17081290 on 2021/2/5.
 */
//切面类: 可以存在多个通知Advice(即增强的方法)
public class MyAspect {
    //切面类中通知
    public void check_Permissions(){
        System.out.println("模拟检查权限.....");
    }
    //切面类中通知
    public void log(){
        System.out.println("模拟记录日志.....");
    }

}
