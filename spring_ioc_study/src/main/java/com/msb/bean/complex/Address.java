package com.msb.bean.complex;

/**
 * Created by 17081290 on 2020/12/4.
 */
public class Address {
    private String province;
    private String city;
    private String town;

    public Address() {
        System.out.println("address 构造器");
    }

    public Address(String province, String city, String town) {
        this.province = province;
        this.city = city;
        this.town = town;
        System.out.println("address 构造器=======");
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


    public void init(){
        System.out.println("对象被初始化");
    }

    public void destory(){
        System.out.println("对象被销毁");
    }




    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
