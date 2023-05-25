package com.itheima.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2021/1/29.
 */
public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //构造方式输出结果
        System.out.println(applicationContext.getBean("user1"));
        //设置方式输出结果
        System.out.println(applicationContext.getBean("user2"));
    }
}
