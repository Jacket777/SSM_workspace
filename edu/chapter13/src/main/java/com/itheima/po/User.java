package com.itheima.po;

/**
 * Created by 17081290 on 2021/5/11.
 * 用户POJO类
 */
public class User {
    private Integer id;  //用户id
    private String username; //用户
    private Integer passwd;//用户密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPasswd() {
        return passwd;
    }

    public void setPasswd(Integer passwd) {
        this.passwd = passwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
