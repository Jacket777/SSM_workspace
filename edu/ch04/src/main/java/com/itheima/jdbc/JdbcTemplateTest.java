package com.itheima.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by 17081290 on 2021/2/8.
 */
public class JdbcTemplateTest {
    /**
     * 使用execute方法建表
     */
    @Test
    public void mainTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext06.xml");
        //获取JdbcTemplate实例
        JdbcTemplate jdbcTemplate = (JdbcTemplate)applicationContext.getBean("jdbcTemplate");
        //使用execute()方法执行SQL语句，创建用户管理表
        jdbcTemplate.execute("create table account( id int PRIMARY  KEY auto_increment, username varchar(50),balance double)");
        System.out.println("account 表创建成功");
    }



    @Test
    public void addAccountTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext06.xml");
        //获取AccountDao实例
        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
        //创建Account对象，并向Account对象添加数据
        Account account = new Account();
        account.setUsername("tim");
        account.setBalance(2000.00);
        //执行addAccount方法，并返回结果
        int num = accountDao.addAccount(account);
        if(num > 0){
            System.out.println("成功插入了 "+num+" 条数据！");
        }else{
            System.out.println("插入操作执行失败");
        }
    }


    @Test
    public void updateAccountTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext06.xml");
        //获取AccountDao实例
        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
        //创建Account对象，并向Account对象添加数据
        Account account = new Account();
        account.setId(1);
        account.setUsername("tom");
        account.setBalance(2000.00);
        //执行addAccount方法，并返回结果
        int num = accountDao.updateAccount(account);
        if(num > 0){
            System.out.println("成功修改了 "+num+" 条数据！");
        }else{
            System.out.println("修改操作执行失败");
        }
    }


    @Test
    public void deleteAccountTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext06.xml");
        //获取AccountDao实例
        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
        //执行addAccount方法，并返回结果
        int num = accountDao.deleteAccount(1);
        if(num > 0){
            System.out.println("成功删除了 "+num+" 条数据！");
        }else{
            System.out.println("删除操作执行失败");
        }
    }


    @Test
    public void findAccountByIdTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext06.xml");
        //获取AccountDao实例
        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
        //执行findAccountById方法，并返回结果
        Account account = accountDao.findAccountById(2);
        System.out.println(account);
    }


    @Test
    public void findAllAccountTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext06.xml");
        //获取AccountDao实例
        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
        //执行findAccount()方法，获取Account对象的集合
        List<Account> account = accountDao.findAllAccount();
        //循环输出集合中的对象
        for (Account act:account) {
            System.out.println(act);
        }
    }
}
