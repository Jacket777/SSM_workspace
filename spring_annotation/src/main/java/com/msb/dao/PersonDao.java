package com.msb.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/11/10.
 */

@Repository
@Scope(value="prototype")
public class PersonDao {



    public void save(){
        System.out.println("保存成功");
    }


    public void update(){
        System.out.println("更新成功");
    }
}
