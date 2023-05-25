package com.itheima.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2021/1/29.
 */
public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean);
        }
}
