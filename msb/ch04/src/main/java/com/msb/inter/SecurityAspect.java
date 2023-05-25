package com.msb.inter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by 17081290 on 2021/6/11.
 */
@Component
@Aspect
@Order(1)
public class SecurityAspect {
    @Before("com.msb.inter.LogUtil.myPoint()")
    public static void start(JoinPoint joinPoint){
        Object[]args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("Security:"+name+"方法开始执行，参数是："+Arrays.asList(args));
    }

    @AfterReturning(value="com.msb.inter.LogUtil.myPoint()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Security:"+name+"方法执行结束，结果是："+result );
    }

    @AfterThrowing(value="com.msb.inter.LogUtil.myPoint()",throwing = "exception")
    public static void logException(JoinPoint joinPoint,Exception exception){
        String name = joinPoint.getSignature().getName();
        System.out.println("Security:"+name+"方法出现异常："+exception);
    }

    @After("com.msb.inter.LogUtil.myPoint()")
    public static void end(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("Security:"+name+"方法执行结束了......");
    }
}