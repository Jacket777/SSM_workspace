package com.msb.test;


import com.msb.po.Emp;
import com.msb.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


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

        //4.sqlsession执行映射文件中定义的SQL，并返回映射结果
        Emp emp = sqlSession.selectOne("com.msb.mapper.EmpMapper.findEmpById", 3333);
        System.out.println(emp);

    }







}
