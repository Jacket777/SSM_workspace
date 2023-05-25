package com.itheima.dao;

import com.itheima.po.Customer;

/**
 * Created by 17081290 on 2021/5/17.
 */
public interface CustomerDao {
    //通过id查询客户
    public Customer findCustomerById(Integer id);
}
