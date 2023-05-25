package com.msb.service;

import com.msb.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by 17081290 on 2020/11/27.
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;


    /**
     * 结账：传入哪个用户买了哪本书
     * @param username
     * @param id
     */
//    @Transactional(timeout = 3, readOnly=true)
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//    }


    /**
     * 测试超时--超时3秒就报错，事务终止
     */
//    @Transactional(timeout = 3)
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//    }


    /**
     * 测试只读事务---更新则报错
     * @param username
     * @param id
     */
//    @Transactional(timeout = 3,readOnly = true)
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//    }


    /**
     * 设置异常不回滚---第一种方式
     * 注意：运行时异常默认回滚，编译时异常默认不回滚
     * @param username
     * @param id
     */
//    @Transactional(timeout = 3,noRollbackFor = {ArithmeticException.class,NullPointerException.class})
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//        int i = 1/0;
//    }


    /**
     * 设置异常不回滚---第二种方式
     * 注意：运行时异常默认回滚，编译时异常默认不回滚
     * @param username
     * @param id
     */
//    @Transactional(timeout = 3,noRollbackForClassName = {"java.lang.ArithmeticException"})
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//        int i = 1/0;
//    }


    /**
     * 设置异常回滚---第一种方式
     * @param username
     * @param id
     */
//    @Transactional(timeout = 3,rollbackFor = {FileNotFoundException.class})
//    public void checkOut(String username,int id) throws FileNotFoundException {
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//        //int i = 1/0;
//        new FileInputStream("aa.txt");
//    }


    /**
     * 设置异常回滚---第二种方式
     * @param username
     * @param id
     */
//    @Transactional(timeout = 3,rollbackForClassName = {"java.io.FileNotFoundException"})
//    public void checkOut(String username,int id) throws FileNotFoundException {
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//        //int i = 1/0;
//        new FileInputStream("aa.txt");
//    }



    //--------测试事务传播特性------------------

//    @Transactional(propagation = Propagation.REQUIRED)
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//    }
//
//    @Transactional(propagation = Propagation.REQUIRED)
//    public void updatePrice(int id,int price)  {
//        bookDao.updatePrice(id,price);
//        int i = 1/0;
//    }


//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//    }
//
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void updatePrice(int id,int price)  {
//        bookDao.updatePrice(id,price);
//        int i = 1/0;
//    }


//    @Transactional(propagation = Propagation.REQUIRED)
//    public void checkOut(String username,int id){
//        bookDao.updateStock(id);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
//    }
//
//    @Transactional(propagation = Propagation.REQUIRED)
//    public void updatePrice(int id,int price)  {
//        bookDao.updatePrice(id,price);
//    }



    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void checkOut(String username,int id){
        bookDao.updateStock(id);
        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username,price);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updatePrice(int id,int price)  {
        bookDao.updatePrice(id,price);
    }

    @Transactional
    public void mulTx(){
        checkOut("zhangsan",1);
        updatePrice(1,1000);
        int i = 1 / 0;
    }


}
