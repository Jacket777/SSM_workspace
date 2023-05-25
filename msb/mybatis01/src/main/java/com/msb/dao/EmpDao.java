package com.msb.dao;

import com.msb.bean.Emp;

/**
 * Created by 17081290 on 2021/1/7.
 */
public interface EmpDao {
    public Emp findEmpByEmpNo(Integer empno);
    public Integer save(Emp emp);
    public Integer update(Emp emp);
    public Integer delete(Integer empno);
    public Emp selectEmpByEmpNo(Integer empno);
}
