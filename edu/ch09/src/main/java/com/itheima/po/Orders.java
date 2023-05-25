package com.itheima.po;

import java.util.List;

/**
 * Created by 17081290 on 2021/1/15.
 * 订单持久化类
 */
public class Orders {
    private Integer id;  //订单id
    private String number; //订单编号
    private List<Product> productList;//关联商品集合信息

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {

        this.productList = productList;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//
//    @Override
//    public String toString() {
//        return "Orders[id=" + id + ", number='" + number + "]";
//    }



    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", productList=" + productListtoString(productList) +
                '}';
    }



    public String productListtoString(List<Product> productList){
        String result="";
        for (Product product:productList
             ) {
            result+=product.toString();
        }
        return result;
    }

}
