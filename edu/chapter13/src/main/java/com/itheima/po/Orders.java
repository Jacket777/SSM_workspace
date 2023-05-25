package com.itheima.po;

/**
 * Created by 17081290 on 2021/5/11.
 * 订单POJO
 */
public class Orders {
    private Integer ordersId;//订单编号
    private User user; //用户POJO,所属用户

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
