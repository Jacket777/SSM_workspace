package com.itheima.test;


import com.itheima.po.User;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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

    @Test
    public void findAllUserTest(){
        //获取sqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        //SqlSession执行映射文件中定义SQL，并返回映射结果
        List<User> list = sqlSession.selectList("com.itheima.mapper"+".UserMapper.findAllUser");
        for(User user: list){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }



}
