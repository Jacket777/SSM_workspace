package com.msb.util;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by 17081290 on 2020/11/19.
 */
@Component
@Aspect
public class LogUtil {
    /*
       设置下面方法在什么时候运行
           @Before:在目标方法之前运行：前置通知
           @After:在目标方法之后运行：后置通知
           @AfterReturning:在目标方法正常返回之后：返回通知
           @AfterThrowing:在目标方法抛出异常后开始运行：异常通知
           @Around:环绕：环绕通知

           当编写完注解之后还需要设置在哪些方法上执行，使用表达式
           execution(访问修饰符  返回值类型 方法全称)
        */
    @Before("execution( public int com.msb.inter.MyCalculator.*(int,int))")
    public static void start(){
        System.out.println("方法开始执行，参数是：");
    }

    @AfterReturning("execution( public int com.msb.inter.MyCalculator.*(int,int))")
    public static void stop(){
        System.out.println("方法执行完成，结果是：");

    }

    @AfterThrowing("execution( public int com.msb.inter.MyCalculator.*(int,int))")
    public static void logException(){
        System.out.println("方法出现异常：");
    }

    @After("execution( public int com.msb.inter.MyCalculator.*(int,int))")
    public static void end(){
        System.out.println("方法执行结束了......");
    }
}
