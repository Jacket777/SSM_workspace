package com.itheima.po;

/**
 * Created by 17081290 on 2021/5/31.
 * 客户持久化类
 */
public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;

    public Integer getId() {return id;}
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getJobs() {
        return jobs;
    }
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
