package com.itheima.convert;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by 17081290 on 2021/5/11.
 */
public class DateFormatter implements Formatter<Date> {
    //定义日期格式
    String datePattern = "yyyy-MM-dd HH:mm:ss";
    //声明SimpleDateFormat对象
    private SimpleDateFormat simpleDateFormat;

    @Override
    public String print(Date date,Locale locale){
        return new SimpleDateFormat().format(date);
    }

    @Override
    public Date parse(String source,Locale locale)throws ParseException{
        simpleDateFormat = new SimpleDateFormat(datePattern);
        return simpleDateFormat.parse(source);
    }

}
