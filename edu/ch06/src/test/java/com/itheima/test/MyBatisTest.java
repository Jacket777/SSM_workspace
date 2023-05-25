package com.itheima.test;

import com.itheima.po.Customer;
import com.itheima.po.Emp;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by 17081290 on 2021/1/14.
 */


public class MyBatisTest {
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
     * 根据客户编号查询客户信息
     * @throws Exception
     */
    @Test
    public void findCustomerByIdTest()throws Exception{
        //1.读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.根据配置文件构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过sqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.sqlsession执行映射文件中定义的SQL，并返回映射结果
        Customer customer = sqlSession.selectOne("com.edu.mapper" + ".CustomerMapper.findCustomerById", 1);
        System.out.println(customer.toString());
        //5.关闭sqlSession
        sqlSession.close();
    }




    @Test
    public void findEmpByIdTest()throws Exception{
        //1.读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.根据配置文件构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过sqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.sqlsession执行映射文件中定义的SQL，并返回映射结果
        Emp emp = sqlSession.selectOne("com.edu.mapper" + ".EmpMapper.findEmpById", 3333);
        System.out.println(emp);
        //5.关闭sqlSession
        sqlSession.close();
    }






}
