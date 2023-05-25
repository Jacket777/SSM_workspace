package com.itheima.dao;

import com.itheima.po.Customer;

/**
 * Created by 17081290 on 2021/5/31.
 * Customer接口文件
 */
public interface CustomerDao {
    /**
     * 根据id查询客户信息
     * @param id
     * @return
     */
    public Customer findCustomerById(Integer id);
}
