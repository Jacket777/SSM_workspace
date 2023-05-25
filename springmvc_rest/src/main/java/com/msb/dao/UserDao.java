package com.msb.dao;

import com.msb.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/12/23.
 */
@Repository
public class UserDao {
    public void save(User user){
        System.out.println("save");
    }

    public void update(Integer  id){
        System.out.println("update");
        System.out.println(id);
    }

    public void delete(Integer id){
        System.out.println("delete");
        System.out.println(id);
    }

    public void query(){
        System.out.println("query");
    }



}
