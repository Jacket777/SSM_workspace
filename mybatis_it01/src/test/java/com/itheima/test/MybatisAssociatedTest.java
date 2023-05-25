package com.itheima.test;

import com.itheima.po.Orders;
import com.itheima.po.Person;
import com.itheima.po.Product;
import com.itheima.po.Users;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by 17081290 on 2021/1/15.
 * Mybatis 关联查询映射测试类
 */
public class MybatisAssociatedTest {
    private  static SqlSession sqlSession = null;

    @Before
    public void setSqlSession(){
        sqlSession = MyBatisUtils.getSession();
    }

    @After
    public void closeSession(){
        sqlSession.close();
    }




    /**
     * 嵌套查询
     */
    @Test
    public void findPersonByTest(){
        Person person = sqlSession.selectOne("com.itheima.mapper." +
                "PersonMapper.findPersonById", 1);
        System.out.println(person);
    }


    /**
     * 嵌套结果
     */
    @Test
    public void findPersonByTest2(){
        Person person = sqlSession.selectOne("com.itheima.mapper." +
                "PersonMapper.findPersonById2", 1);
        System.out.println(person);
    }


    /**
     * 一对多 --嵌套结果
     */
    @Test
    public void findUserTest(){
        Users user = sqlSession.selectOne("com.itheima.mapper.UsersMapper.findUserWithOrders",1);
        System.out.println(user);
    }


    /**
     * 一对多 --嵌套查询
     */
    @Test
    public void findUserTest2(){
        Users user = sqlSession.selectOne("com.itheima.mapper.UsersMapper.findUserWithOrders2",1);
        System.out.println(user);
    }


    /**
     * 多对多---嵌套查询
     */
    @Test
    public void findOrdersTest(){
        Orders orders = sqlSession.selectOne("com.itheima.mapper.OrdersMapper.findOrdersWithProduct",1);
        System.out.println(orders);
        List<Product> list = orders.getProductList();
        for (Product product:list) {
            System.out.println(product.toString());

        }
    }


    /**
     * 多对多----嵌套结果
     */
    @Test
    public void findOrdersTest2(){
        Orders orders = sqlSession.selectOne("com.itheima.mapper.OrdersMapper.findOrdersWithProduct2",1);
        System.out.println(orders);
        List<Product> list = orders.getProductList();
        for (Product product:list) {
            System.out.println(product.toString());
        }
    }


}
