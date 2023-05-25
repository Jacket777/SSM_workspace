package com.msb.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by 17081290 on 2020/11/19.
 */
@Component
@Aspect
@Order(2)
public class LogUtil2 {
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


    @Pointcut("execution( public int com.msb.inter.MyCalculator2.*(int,int))")
    public void myPoint(){

    }



    //@Before("execution( public int com.msb.inter.MyCalculator2.*(int,int))")
    @Before("myPoint()")
    public static void start(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法开始执行，参数是："+ Arrays.asList(args));
    }

    //@AfterReturning(value = "execution( public int com.msb.inter.MyCalculator2.*(int,int))",returning = "result")
    @AfterReturning(value = "myPoint()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行完成，结果是："+result);
    }

    //@AfterThrowing(value="execution( public int com.msb.inter.MyCalculator2.*(int,int))",throwing="exception")
    @AfterThrowing(value="myPoint()",throwing="exception")
    public static void logException(JoinPoint joinPoint,Exception exception){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法出现异常："+exception);
    }

    //@After("execution( public int com.msb.inter.MyCalculator2.*(int,int))")
    @After("myPoint()")
    public void  end(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行结束了......");
    }


    @Around("myPoint()")
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
