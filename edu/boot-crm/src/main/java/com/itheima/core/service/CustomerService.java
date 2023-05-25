package com.itheima.core.service;

import com.itheima.common.utils.Page;
import com.itheima.core.po.Customer;

/**
 * Created by 17081290 on 2021/6/1.
 */
public interface CustomerService {
    /**
     * 根据类别代码查询数据字典
     * @return
     */
    public Page<Customer> findCustomerList(Integer page, Integer rows,
                                           String custName, String custSource,
                                           String custIndustry, String custLevel);
    //311
    public int createCustomer(Customer customer);

    //通过id查询客户
    public Customer getCustomerById(Integer id);

    //更新客户
    public int updateCustomer(Customer customer);

    //删除客户
    public int deleteCustomer(Integer id);

}
