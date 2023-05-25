package com.msb.dao;

import com.msb.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/11/23.
 */
@Repository
public class EmpDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Emp emp){
        String sql = "insert into emp(empno,ename)values(?,?)";
        int update = jdbcTemplate.update(sql,emp.getEmpno(),emp.getEname());
        System.out.println(update);
    }
}
