package com.msb.dao;

import com.msb.bean.Dog;
import org.omg.PortableInterceptor.Interceptor;

/**
 * Created by 17081290 on 2021/1/18.
 */
public interface DogDao {
    public Dog selectDogById(Integer id);
}
