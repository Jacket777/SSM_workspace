package com.itheima.assemble;

import java.util.List;

/**
 * Created by 17081290 on 2021/1/29.
 */
public class User {
    private String username;
    private Integer password;
    private List<String> list;


    /**
     * 1.使用构造注入
     * 1.1.提供带所有参赛的有参构造方法
     */
    public User(String username, Integer password,List<String> list) {
        System.out.println("构造函数进行构造");
        this.username = username;
        this.list = list;
        this.password = password;
    }

    /**
     * 2.使用设置注入
     * 2.1.提供默认空参构造方法
     * 2.2.为所有属性值提供setter方法
     */

    public User() {
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Integer getPassword() {

        return password;
    }

    public void setPassword(Integer password) {
        System.out.println("password===="+password);
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("username===="+username);
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
