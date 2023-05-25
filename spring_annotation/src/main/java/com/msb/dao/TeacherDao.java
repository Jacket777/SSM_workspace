package com.msb.dao;

import com.msb.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/11/10.
 */

@Repository
public class TeacherDao extends BaseDao<Teacher>{
    public void save(){
        System.out.println("保存老师");
    }
}
