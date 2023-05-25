package com.msb.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2021/6/11.
 */
public class MyTest {
    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        MyCalculator bean = context.getBean(MyCalculator.class);
        bean.add(1,1);
    }
}
