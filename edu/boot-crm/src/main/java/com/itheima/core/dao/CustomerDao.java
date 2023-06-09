package com.itheima.core.dao;

import com.itheima.core.po.Customer;

import java.util.List;

/**
 * Created by 17081290 on 2021/6/1.
 * Customer接口
 */
public interface CustomerDao {
    //客户列表
    public List<Customer> selectCustomerList(Customer customer);
    //客户数
    public Integer selectCustomerListCount(Customer customer);
    //创建客户
    public int createCustomer(Customer customer);
    //通过id查询客户
    public Customer getCustomerById(Integer id);
    //更新客户信息
    public int updateCustomer(Customer customer);
    //删除用户
    public int deleteCustomer(Integer id);



}
