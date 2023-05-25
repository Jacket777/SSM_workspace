package com.msb.dao;

import com.msb.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/12/8.
 */
@Repository
public class StudentDao extends BaseDao<Student> {
    public void save(){
        System.out.println("保存学生");
    }
}
