package com.itheima.dao.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by 17081290 on 2021/5/17.
 */
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("com.itheima.mapper.CustomerMapper.findCustomerById",id);
    }
}
