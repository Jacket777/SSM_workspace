package com.itheima.test;

import com.itheima.dao.CustomerDao;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;
import com.itheima.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2021/5/17.
 * DAO 测试类
 */
public class DaoTest {
    @Test
    public void findCustomerByIdDaoTest(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据容器中Bean的id来获取指定Bean
       // CustomerDao customerDao = (CustomerDao)act.getBean("customerDao");
        //获取Bean时，不再需要进行强制类型转换
        CustomerDao customerDao = act.getBean(CustomerDao.class);
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);

    }


    @Test
    public void findCustomerByIdMapperTest(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据容器中Bean的id来获取指定Bean
        // CustomerDao customerDao = (CustomerDao)act.getBean("customerDao");
        //获取Bean时，不再需要进行强制类型转换
        CustomerMapper customerMapper = act.getBean(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(1);
        System.out.println(customer);

    }

    @Test
    public void addCustomer(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = act.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setUsername("zhangsan4");
        customer.setJobs("mangager");
        customer.setPhone("123456789");
        service.addCustomer(customer);

    }





}

