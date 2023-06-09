package com.itheima.core.service.impl;

import com.itheima.core.dao.BaseDictDao;
import com.itheima.core.po.BaseDict;
import com.itheima.core.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 17081290 on 2021/6/1.
 */
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictDao baseDictDao;
    @Override
    public List<BaseDict> findBaseDictByTypeCode(String typecode) {
        return baseDictDao.selectBaseDictByTypeCode(typecode);
    }
}
