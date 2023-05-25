package com.msb.inter;

import org.springframework.stereotype.Service;

/**
 * Created by 17081290 on 2020/11/19.
 */

public class MyCalculator3 {
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    public int mult(int i, int j) {
        int result = i * j;
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        return result;
    }

}
