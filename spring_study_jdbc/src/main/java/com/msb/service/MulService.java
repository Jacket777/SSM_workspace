package com.msb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 17081290 on 2020/12/2.
 */
@Service
public class MulService {
    @Autowired
    private BookService bookService;

//    @Transactional
//    public void mulTx(){
//        bookService.checkOut("zhangsan",1);
//        bookService.updatePrice(1,1000);
//    }


    @Transactional
    public void mulTx(){
        bookService.checkOut("zhangsan",1);
        bookService.updatePrice(1,1000);
        int i = 1/0;
    }
}
