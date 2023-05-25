package com.itheima.po;

/**
 * Created by 17081290 on 2020/12/14.
 * 用户POJO类
 */
public class User {
    private Integer id;  //用户ID
    private String username; //用户名
    private Integer password;//用户密码

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
