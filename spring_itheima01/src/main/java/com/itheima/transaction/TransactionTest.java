package com.itheima.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2021/2/9.
 * 测试类
 */
public class TransactionTest {
    /**
     * 使用xml
     */
    @Test
    public void xmlTest(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext07.xml");
        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
        //调用实例中转账方法
        accountDao.transfer("Jack","Rose",100.0);
        System.out.println("转账成功");
    }


    /**
     * 使用注解
     */
    @Test
    public void annotationTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext08.xml");
        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
        //调用实例中转账方法
        accountDao.transfer("Jack","Rose",100.0);
        System.out.println("转账成功");
    }

}
