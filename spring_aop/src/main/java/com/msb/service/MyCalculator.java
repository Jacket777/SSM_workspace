package com.msb.service;

import com.msb.util.LogUtil;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;


@Service
public class MyCalculator {
    public Integer add(Integer i, Integer j) throws NoSuchMethodException {
//        Method add = MyCalculator.class.getMethod("add",Integer.class,Integer.class);
//        LogUtil.start(add,i,j);
        Integer result = i + j;
//        LogUtil.stop(add,i,j);
        return result;
    }

    public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
//        Method sub = MyCalculator.class.getMethod("sub",Integer.class,Integer.class);
//        LogUtil.start(sub,i,j);
        Integer result = i - j;
//        LogUtil.stop(sub,i,j);
        return result;

    }

    public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
//        Method mul = MyCalculator.class.getMethod("mul",Integer.class,Integer.class);
//        LogUtil.start(mul,i,j);
        Integer result = i * j;
//        LogUtil.stop(mul,i,j);
        return result;
    }

    public Integer div(Integer i, Integer j) throws NoSuchMethodException {
//        Method div = MyCalculator.class.getMethod("div",Integer.class,Integer.class);
//        LogUtil.start(div,i,j);
        Integer result = i / j;
//        LogUtil.stop(div,i,j);
        return result;
    }
}
