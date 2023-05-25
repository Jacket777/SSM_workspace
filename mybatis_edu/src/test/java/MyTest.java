import com.msb.po.Customer;
import com.msb.po.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by 17081290 on 2021/1/20.
 */
public class MyTest {
//    @Test
//    public void findCustomerByIdTest()throws Exception{
//        //1.读取配置文件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        //2.根据配置文件构建sqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        //3.通过sqlSessionFactory创建SqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //4.sqlsession执行映射文件中定义的SQL，并返回映射结果
//        Emp emp = sqlSession.selectOne("com.msb.mapper" + ".EmpMapper.findCustomerById", 1);
//        System.out.println(emp);
//        //5.关闭sqlSession
//        sqlSession.close();
//    }



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
        Customer customer = sqlSession.selectOne("com.msb.mapper" + ".CustomerMapper.findCustomerById", 1);
        System.out.println(customer.toString());
        //5.关闭sqlSession
        sqlSession.close();
    }






}
