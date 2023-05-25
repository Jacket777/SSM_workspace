package com.msb.controller;

import com.msb.bean.Student;
import com.msb.dao.BaseDao;
import com.msb.dao.StudentDao;
import com.msb.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 17081290 on 2020/11/11.
 */
@Controller
public class BaseController {
//    @Autowired
//    TeacherDao teacherDao;
//    @Autowired
//    StudentDao studentDao;

    //    public void save(){
//        teacherDao.save();
//    }
//
//    public void save2(){
//        studentDao.save();
//    }

    @Autowired
    BaseDao <Student>baseDao;

    public void save(){
        baseDao.save();
    }




}
