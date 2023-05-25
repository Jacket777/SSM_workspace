package com.msb.proxy;

import com.msb.service.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by 17081290 on 2020/11/13.

 * 必须要有接口，如果没有接口，不能使用，这种方式是用jdk提供的reflect包下的类
 * 但是在生产环境中我不能保证每个类都有实现的接口，所有有第二种方式cglib
 *
 * cglib在实现的时候有没有接口都无所谓
 *
 * 在spring中使用了两种动态代理的方式，一种是jdk提供的（刚刚完成的）另外一种就是cglib
 */
public class CalculatorProxy {
    public static Calculator getProxy(final Calculator calculator){
        //获取被代理对象的加载器
        ClassLoader loader = calculator.getClass().getClassLoader();
        //获取被代理对象的所有接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        //用来执行被代理类的方法
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                //System.out.println("invoke method called");
                System.out.println(method.getName()+"方法开始执行，参数列表是："+ Arrays.asList(args));
                //开始调用被代理类的方法
                try{
                    result = method.invoke(calculator,args);
                    System.out.println(method.getName()+"方法执行完成，结果是："+result);
                }catch (Exception e){
                    System.out.println(method.getName()+"方法异常");
                    e.printStackTrace();
                }finally {
                    System.out.println(method.getName()+"方法获取到结果");
                }


                return result;
            }
        };

       Object o = Proxy.newProxyInstance(loader,interfaces,handler);
        return (Calculator)o;

    }
}
