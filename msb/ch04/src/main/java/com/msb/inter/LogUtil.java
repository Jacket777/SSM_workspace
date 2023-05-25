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
@Order(2)
public class LogUtil {
    @Pointcut("execution( public int com.msb.inter.MyCalculator.*(int,int))")
    public void myPoint(){}

    @Before("myPoint()")
    public static void start(JoinPoint joinPoint){
        Object[]args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法开始执行，参数是："+Arrays.asList(args));
    }

    @AfterReturning(value="myPoint()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行结束，结果是："+result );
    }

    @AfterThrowing(value="myPoint()",throwing = "exception")
    public static void logException(JoinPoint joinPoint,Exception exception){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法出现异常："+exception);
    }

    @After("myPoint()")
    public static void end(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行结束了......");
    }
    
    
    @Around("myPoint()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        String name = proceedingJoinPoint.getSignature().getName();
        Object proceed = null;

        try{
            System.out.println("环绕前置通知："+name+"方法开始，参数是："+Arrays.asList(args));
            proceed = proceedingJoinPoint.proceed(args);
        }catch(Throwable e){
            System.out.println("环绕异常通知："+name+"方法出现异常，异常信息是: "+e);
        }finally {
            System.out.println("环绕后置通知："+name+"方法结束");
        }
        return proceed;
    }
}