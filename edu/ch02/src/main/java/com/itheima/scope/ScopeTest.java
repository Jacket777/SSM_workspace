package com.itheima.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2021/1/29.
 */
public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("===========singleton==================");
        System.out.println(applicationContext.getBean("scope"));
        System.out.println(applicationContext.getBean("scope"));
        System.out.println("===========prototype==================");
        System.out.println(applicationContext.getBean("scope2"));
        System.out.println(applicationContext.getBean("scope2"));
    }
}
