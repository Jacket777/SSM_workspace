package com.itheima.mapper;

import com.itheima.po.Customer;

/**
 * Created by 17081290 on 2021/5/17.
 */
public interface CustomerMapper {
    //通过id查询客户
    public Customer findCustomerById(Integer id);
    //添加客户
    public void addCustomer(Customer customer);
}
