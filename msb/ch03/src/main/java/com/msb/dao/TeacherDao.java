package com.msb.dao;

import com.msb.bean.Student;
import com.msb.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2021/6/10.
 */
@Repository
public class TeacherDao extends BaseDao<Teacher> {
    @Override
    public void save() {
        System.out.println("保存老师");
    }
}
