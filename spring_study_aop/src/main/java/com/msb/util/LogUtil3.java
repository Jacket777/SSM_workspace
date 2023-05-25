package com.msb.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 用于测试基于配置的AOP配置
 * 不用加任何注解
 */

public class LogUtil3 {

    public void myPoint(){

    }

    public static void start(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法开始执行，参数是："+ Arrays.asList(args));
    }


    public static void stop(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行完成，结果是："+result);
    }


    public static void logException(JoinPoint joinPoint,Exception exception){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法出现异常："+exception);
    }


    public void  end(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行结束了......");
    }


    public Object myAround(ProceedingJoinPoint proceedingJoinPoit){
        Object[]args = proceedingJoinPoit.getArgs();
        String name = proceedingJoinPoit.getSignature().getName();
        Object proceed = null;

        try{
            System.out.println("环绕前通知: "+name+"方法开始，参数是"+Arrays.asList(args));
            proceed = proceedingJoinPoit.proceed(args);
            System.out.println("环绕返回通知:"+name+"方法返回，返回值是"+proceed);
        }catch(Throwable e){
            System.out.println("环绕异常通知:"+name+"方法出现异常，异常信息是:"+e);
        }finally{
            System.out.println("环绕后置通知"+name+"方法结束");
        }
        return proceed;
    }



}
