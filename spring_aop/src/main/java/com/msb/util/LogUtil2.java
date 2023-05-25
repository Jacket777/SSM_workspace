package com.msb.util;





import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by 17081290 on 2020/11/13.
 */
@Component
@Aspect
public class LogUtil2 {
    @Before("execution(public int com.msb.service.MyCalculator2.add(Integer,Integer))")
    public static void start(){
        System.out.println(" 方法开始 执行参数是");

    }
    @AfterReturning("execution(public int com.msb.service.MyCalculator2.add(Integer,Integer))")
    public static void stop(){
        System.out.println(" 方法执行完成，结果是 ");
    }


    @AfterThrowing("execution(public int com.msb.service.MyCalculator2.add(Integer,Integer))")
    public static void LogException(){
        System.out.println("方法出现异常： ");
    }

    @After("execution(public int com.msb.service.MyCalculator2.add(Integer,Integer))")
    public static void LogFinally(){
        System.out.println("方法结束了 ");
    }
}
