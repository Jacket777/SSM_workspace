package com.itheima.core.service;

import com.itheima.core.po.BaseDict;

import java.util.List;

/**
 * Created by 17081290 on 2021/6/1.
 */
public interface BaseDictService {
    public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
