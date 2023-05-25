package com.msb.inter;

import org.springframework.stereotype.Service;

/**
 * Created by 17081290 on 2021/6/11.
 */
@Service
public class MyCalculator {
    public int add(int i, int j) {
        int result = i + j;
        return result; }

    public int sub(int i, int j) {
        int result = i-j;
        return result;
    }
    public int mul(int i, int j) {
        int result = i-j;
        return result;
    }
    public int div(int i, int j) {
        int result = i/j;
        return result;
    }
}


