package com.itheima.core.dao;

import com.itheima.core.po.BaseDict;

import java.util.List;

/**
 * Created by 17081290 on 2021/6/1.
 */
public interface BaseDictDao {
    //根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
