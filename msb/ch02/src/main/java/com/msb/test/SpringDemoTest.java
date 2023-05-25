package com.msb.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.msb.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.SQLException;

/**
 * Created by 17081290 on 2021/6/2.
 */
public class SpringDemoTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc12.xml");
       Person person = context.getBean("person", Person.class);
       System.out.println(person);
    }
}
