package com.msb.dao;

import com.msb.bean.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 17081290 on 2021/1/18.
 */
public interface EmpDao {
    public Emp selectEmpByEmpno(Integer empno);

    public Emp selectEmpByStep(Integer empno);

    public Emp selectEmpByStep2(Integer deptno);

    public Emp selectEmpByCondition(Emp emp);

    public List<Emp> selectEmpByDeptnos(@Param("deptnos") List<Integer> deptnos);

    public Integer update(Emp emp);
}
