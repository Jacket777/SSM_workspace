import com.alibaba.druid.pool.DruidDataSource;
import com.msb.bean.Emp;
import com.msb.dao.EmpDao;
import com.msb.service.BookService;
import com.msb.service.MulService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 17081290 on 2020/11/19.
 */
public class MyTest {

//    @Test
//    public void test01() throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
//        System.out.println(dataSource);
//        System.out.println(dataSource.getConnection());
//    }


//    @Test
//    public void test02() throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        System.out.println(jdbcTemplate);
//        //System.out.println(jdbcTemplate.getConnection());
//    }


//    @Test
//    public void test03() throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        System.out.println(jdbcTemplate);
//        //System.out.println(jdbcTemplate.getConnection());
//    }



//插入数据
//    @Test
//    public void test04()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String sql = "insert into emp(empno,ename) value(?,?)";
//        int result = jdbcTemplate.update(sql,1111,"zhangsan");
//        System.out.println(result);
//    }


    /**
     * 批量插入
     */
//    @Test
//    public void test05()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String sql = "insert into emp(empno,ename) values(?,?)";
//        List<Object[]> list = new ArrayList<Object[]>();
//        list.add(new Object[]{4,"zhangsan4"});
//        list.add(new Object[]{5,"zhangsan5"});
//        list.add(new Object[]{6,"zhangsan6"});
//        int[]result = jdbcTemplate.batchUpdate(sql,list);
//        for (int i:result) {
//            System.out.println(i);
//        }
//    }


    /**
     * 查询某个值，并以对象的方式返回
     * @throws SQLException
     */


//    @Test
//    public void test06()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String sql = "select * from emp where empno=?";
//        Emp emp = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Emp>(Emp.class),1);
//        System.out.println(emp);
//    }


    /**
     * 查询返回集合对象
     * @throws SQLException
     */
//    @Test
//    public void test07()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String sql = "select * from emp  where sal >?";
//        List<Emp> query = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Emp>(Emp.class),1500);
//        for (Emp emp:query) {
//            System.out.println(emp);
//        }
//    }


    /**
     * 返回组合函数的值
     * @throws SQLException
     */
//    @Test
//    public void test08()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String sql = "select max(sal) from emp ";
//        int result = jdbcTemplate.queryForObject(sql,Integer.class);
//        System.out.println(result);
//    }


    /**
     * 使用具备具名函数的JdbcTemplate
     * @throws SQLException
     */

//    @Test
//    public void test09()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        NamedParameterJdbcTemplate jdbcTemplate = context.getBean("namedParameterJdbcTemplate", NamedParameterJdbcTemplate.class);
//        String sql = "insert into emp(empno,ename) values(:empno,:ename)";
//        Map<String,Object>map = new HashMap<String, Object>();
//        map.put("empno",2222);
//        map.put("ename","sili");
//        int update = jdbcTemplate.update(sql,map);
//        System.out.println(update);
//    }


//    @Test
//    public void test10()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        EmpDao empDao = context.getBean(EmpDao.class);
//        empDao.save(new Emp(3333,"wangwu"));
//    }


    /**
     * 下面部分，为测试事务
     */

    /**
     * 测试事务超时
     * @throws SQLException
     *
     */
//    @Test
//    public void test11()throws SQLException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        BookService bookService = context.getBean("bookService", BookService.class);
//        bookService.checkOut("zhangsan",1);
//    }


//    @Test
//    public void test12() throws SQLException, FileNotFoundException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        BookService bookService = context.getBean("bookService", BookService.class);
//        bookService.checkOut("zhangsan",1);
//    }


//-----------测试事务传播特性

//    @Test
//    public void test13() throws SQLException, FileNotFoundException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        MulService mulService = context.getBean("mulService", MulService.class);
//        mulService.mulTx();
//    }


//    @Test
//    public void test13() throws SQLException, FileNotFoundException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
//        MulService mulService = context.getBean("mulService", MulService.class);
//        mulService.mulTx();
//    }


    @Test
    public void test12() throws SQLException, FileNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.mulTx();
    }















}


