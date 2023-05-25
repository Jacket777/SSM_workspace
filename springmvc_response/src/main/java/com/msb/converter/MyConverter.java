package com.msb.converter;

import com.msb.bean.User;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by 17081290 on 2020/12/28.
 */
public class MyConverter implements Converter<String,User>{

    @Override
    public User convert(String source){//拿到字符串进行设置
        User user = null;
        if((source!=null)&&!"".equals(source)&&(source.split("-").length == 4)){
            user = new User();
            user.setId(Integer.parseInt(source.split("-")[0]));
            user.setName(source.split("-")[1]);
            user.setAge(Integer.parseInt(source.split("-")[2]));
            user.setPassword(source.split("-")[3]);
        }
        return user;
    }

}
