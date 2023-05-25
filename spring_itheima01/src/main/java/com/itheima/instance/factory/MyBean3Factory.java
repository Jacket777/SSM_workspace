package com.itheima.instance.factory;

/**
 * Created by 17081290 on 2021/1/29.
 */
public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("bean3 工厂实例化中");
    }


    public Bean3 createBean(){
        return new Bean3();
    }
}
