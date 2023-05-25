package com.msb.service;

import org.springframework.stereotype.Service;

/**
 * Created by 17081290 on 2020/11/13.
 */
@Service
public interface Calculator {
    public Integer add(Integer i,Integer j) throws NoSuchMethodException;
    public Integer sub(Integer i,Integer j) throws NoSuchMethodException;
    public Integer mul(Integer i,Integer j) throws NoSuchMethodException;
    public Integer div(Integer i,Integer j) throws NoSuchMethodException;
}
