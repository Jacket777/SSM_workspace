package com.msb;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 17081290 on 2021/1/4.
 * 处理系统的全部异常
 */
@ControllerAdvice
public class MyGlobalExceptionHandler {
    @ExceptionHandler(value={ArithmeticException.class,NullPointerException.class})
    public ModelAndView handlerException(Exception exception){
        System.out.println("global------exception");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exec",exception);
        return mv;
    }


    @ExceptionHandler(value = {Exception.class})
    public ModelAndView handlerException2(Exception exception){
        System.out.println("global-----exception2");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exec",exception);
        return mv;
    }
}
