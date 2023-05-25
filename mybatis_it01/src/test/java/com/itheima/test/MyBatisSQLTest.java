package com.itheima.test;

import com.itheima.po.Customer;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17081290 on 2021/1/26.
 * mybatis 动态SQL测试
 *
 */
public class MyBatisSQLTest {

    /**
     *根据客户姓名和职业组合条件查询客户信息列表
     * 测试IF
     */
    @Test
    public void findCustomerByNameAndJobsTest(){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers = session.selectList("com.itheima.mapper" +
                ".CustomerMapper.findCustomerByNameAndJobs", customer);
        for (Customer ct:customers) {
            System.out.println(ct);
        }
        session.close();
    }



    /**
     * 根据客户姓名或职业组合条件查询客户信息列表
     * 测试<choose> <when>  <otherwise>元素
     */
    @Test
    public void findCustomerByNameOrJobsTest(){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        //customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers = session.selectList("com.itheima.mapper" +
                ".CustomerMapper.findCustomerByNameOrJobs", customer);
        for (Customer ct:customers) {
            System.out.println(ct);
        }
        session.close();
    }



    /**
     *测试where用法
     */
    @Test
    public void findCustomerByWhereTest(){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers = session.selectList("com.itheima.mapper" +
                ".CustomerMapper.findCustomerByWhere", customer);
        for (Customer ct:customers) {
            System.out.println(ct);
        }
        session.close();
    }




    /**
     *测试<trim>元素使用用法
     */
    @Test
    public void findCustomerByTrim(){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers = session.selectList("com.itheima.mapper" +
                ".CustomerMapper.findCustomerByTrim", customer);
        for (Customer ct:customers) {
            System.out.println(ct);
        }
        session.close();
    }


    /**
     *测试<set>元素使用用法
     */
    @Test
    public void updateCustomerBySet(){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        customer.setId(3);
        customer.setUsername("jack");
        customer.setJobs("teacher");
        customer.setPhone("158558009");
        int rows = session.update("com.itheima.mapper" +
                ".CustomerMapper.updateCustomerBySet", customer);
        //4.3.通过返回结果判决删除操作是否成功
        if(rows > 0){
            System.out.println("你成功更新了 "+rows+"条数据");
        }else{
            System.out.println("执行更新失败");
        }
        session.commit();
        session.close();
    }





    /**
     * 根据客户编号批量查询客户信息
     * foreach用法
     *
     */
    @Test
    public void findCustomerByIdsTest(){
        SqlSession session = MyBatisUtils.getSession();
        List<Integer>ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        //int []ids = {1,2};

        List<Customer> customers = session.selectList("com.itheima.mapper" +
                ".CustomerMapper.findCustomerByIds", ids);
        for(Customer customer:customers){
            System.out.println(customer);
        }
        session.close();
    }


    /**
     * 根据客户名模糊查询客户信息
     * bind使用
     */

    @Test
    public void findCustomerByNamebybindTest(){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("j");
        List<Customer> customers = session.selectList("com.itheima.mapper" +
                ".CustomerMapper.findCustomerByNameBind", customer);
        for(Customer customer2:customers){
            System.out.println(customer2);
        }
        session.close();
    }


}
