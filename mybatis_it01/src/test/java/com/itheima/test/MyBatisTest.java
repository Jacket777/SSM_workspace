package com.itheima.test;

import com.itheima.po.Customer;
import com.itheima.po.User;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
        Customer customer = sqlSession.selectOne("com.itheima.mapper" + ".CustomerMapper.findCustomerById", 1);
        System.out.println(customer.toString());
        //5.关闭sqlSession
        sqlSession.close();
    }


    /**
     * 根据用户名来模糊查询用户信息列表
     * @throws Exception
     */
   @Test
   public void findCustomerByNameTest()throws Exception{
        //SqlSession sqlSession = MyBatisUtils.getSession();
       //1.读取配置文件
       String resource = "mybatis-config.xml";
       InputStream inputStream = Resources.getResourceAsStream(resource);
       //2.根据配置文件构建sqlSessionFactory
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       //3.通过sqlSessionFactory创建SqlSession
       SqlSession sqlSession = sqlSessionFactory.openSession();

       //4.sqlsession执行映射文件中定义的SQL，并返回映射结果
       List<Customer> customers = sqlSession.selectList("com.itheima.mapper" + ".CustomerMapper.findCustomerByName", "j");
       for (Customer customer:customers) {
           System.out.println(customer.getJobs());
           System.out.println(customer);
       }
       sqlSession.close();
   }


   @Test
   public void addCustomerTest()throws Exception{
      //1.读取配置文件
      String resource = "mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(resource);
      //2.根据配置文件构建sqlSessionFactory
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
      //3.通过sqlSessionFactory创建SqlSession
      SqlSession sqlSession = sqlSessionFactory.openSession();
      //4.SqlSession执行添加操作
     //4.1.创建Customer对象，并向对象中添加数据
     Customer customer = new Customer();
     customer.setUsername("rose");
     customer.setJobs("student");
     customer.setPhone("13333533092");
     //4.2.执行sqlsession 的插入方法，返回的是SQL语句影响的行
     int rows = sqlSession.insert("com.itheima.mapper" + ".CustomerMapper.addCustomer", customer);
     //输出插入数据的注解id值
     System.out.println(customer.getId());

     //4.3.通过返回结果判决插入操作是否成功
     if(rows > 0){
         System.out.println("你成功插入了 "+rows+"条数据");
     }else{
         System.out.println("执行插入失败");
     }
     //4.4.提交事务
     sqlSession.commit();
     sqlSession.close();
 }


    /**
     * 更新客户
     */
    @Test
    public void updateCustomerTest()throws Exception{
        //1.读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.根据配置文件构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过sqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.SqlSession执行添加操作
        //4.1.创建Customer对象，并向对象中添加数据
        Customer customer = new Customer();
        customer.setId(3);
        customer.setUsername("tom");
        customer.setJobs("worker");
        customer.setPhone("13333531112");
        //4.2.执行sqlsession 的更新方法，返回的是SQL语句影响的行
        int rows = sqlSession.update("com.itheima.mapper"+".CustomerMapper.updateCustomer",customer);
        //4.3.通过返回结果判决更新操作是否成功
        if(rows > 0){
            System.out.println("你成功更新了 "+rows+"条数据");
        }else{
            System.out.println("执行更新失败");
        }
        sqlSession.commit();
        sqlSession.close();

    }



    @Test
    public void deleteCustomerTest()throws Exception{
        //1.读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.根据配置文件构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过sqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.2.执行sqlsession 的删除方法，返回的是SQL语句影响的行
       int rows = sqlSession.delete("com.itheima.mapper" + ".CustomerMapper.deleteCustomer", 4);
       //4.3.通过返回结果判决删除操作是否成功
       if(rows > 0){
           System.out.println("你成功删除了 "+rows+"条数据");
       }else{
           System.out.println("执行删除失败");
       }
       sqlSession.commit();
       sqlSession.close();



   }



    @Test
    public void findAllUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        List<User> list = sqlSession.selectList("com.itheima.mapper"+".UserMapper.findAllUser");
        for(User user: list){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }



}
