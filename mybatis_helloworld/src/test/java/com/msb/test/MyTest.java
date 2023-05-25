package com.msb.test;

import com.msb.bean.Emp;
import com.msb.bean.User;
import com.msb.dao.EmpDao;
import com.msb.dao.UserDao;
import com.msb.dao.UserDaoAnnotation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 17081290 on 2021/1/18.
 */
public class MyTest {
    SqlSession sqlSession = null;

    @Before
    public void init(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try{
            inputStream = Resources.getResourceAsStream(resource);
        }catch (IOException e){
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }


    /**
     * 测试查询操作----测试通过
     * @throws IOException
     */
    @Test
    public void test01()throws IOException{
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Emp emp = mapper.selectEmpByEmpNo(3333);
        System.out.println(emp);
//      Emp emp= sqlSession.selectOne("com.msb.mapper.EmpDao.EmpDaoMapper.selectEmpByEmpNo", 3333);
//      System.out.println(emp);

    }


    /**
     * 测试插入操作---测试通过
     */
    @Test
    public void test02(){
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        //System.out.println("-------"+mapper.getClass().toString()+"--------"); 反射加动态代理
        Emp emp = new Emp();
        emp.setEmpno(3336);
        emp.setEname("zhangsan6");
        Integer save = mapper.save(emp);
        System.out.println(save);
        sqlSession.commit();
    }


    /**
     * 测试更新操作
     */
    @Test
    public void test03(){
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(3333);
        emp.setEname("zhangsan2");
        emp.setSal(500.23);
        Integer update = mapper.update(emp);
        System.out.println(update);
        sqlSession.commit();

    }


    /**
     * 测试删除操作
     */
    @Test
    public void test04(){
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Integer delete = mapper.delete(3333);
        System.out.println(delete);
        sqlSession.commit();
    }


    /**
     * 测试查询操作
     * @throws IOException
     */
    @Test
    public void test05()throws IOException{
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user = mapper.selectUserById(1);
        System.out.println(user);
    }


    /**
     * 测试注释
     * @throws IOException
     */
    @Test
    public void test06()throws IOException{
        UserDaoAnnotation mapper = sqlSession.getMapper(UserDaoAnnotation.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
    }



    @After
    public void after()throws IOException{
        sqlSession.close();
    }


}
