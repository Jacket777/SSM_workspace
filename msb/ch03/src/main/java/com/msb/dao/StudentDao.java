package com.msb.dao;

import com.msb.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2021/6/10.
 */
@Repository
public class StudentDao extends BaseDao<Student> {
    @Override
    public void save() {
        System.out.println("保存学生");
    }
}
