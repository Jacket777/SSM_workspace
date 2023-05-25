package com.itheima.po;

/**
 * Created by 17081290 on 2021/1/15.
 */
public class IdCard {
    private Integer id;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
