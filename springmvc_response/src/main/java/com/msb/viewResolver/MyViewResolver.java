package com.msb.viewResolver;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Created by 17081290 on 2020/12/28.
 */
@Component
//@Order(1)
public class MyViewResolver implements ViewResolver,Ordered {
    public void setOrder(int order) {
        this.order = order;
    }

    private int order = 0;


    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if(viewName.startsWith("msb:")){
            System.out.println(viewName);
            return new MyView();
        }else{
            return null;
        }
    }


    public int getOrder() {
        return 0;
    }



}
