package com.msb.dao;

import com.msb.bean.Dept;

/**
 * Created by 17081290 on 2021/1/18.
 */
public interface DeptDao {

    public Dept selectDeptByDeptno(Integer deptno);

    public Dept selectDeptByStep(Integer deptno);

    public Dept selectDeptByStemp2(Integer deptno);
}
