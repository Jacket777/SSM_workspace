package com.msb.inter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by 17081290 on 2021/6/11.
 * 帮助Calculator生成代理对象的类
 */
//public class CalculatorProxy {
//    public static Calculator getProxy(final Calculator calculator){
//        //1.被代理对象的类加载器
//        ClassLoader loader = calculator.getClass().getClassLoader();
//        //2.被代理对象的接口
//        Class<?>[] interfaces = calculator.getClass().getInterfaces();
//        //3.方法执行器，执行被代理对象的目标方法
//        InvocationHandler h = new InvocationHandler() {
//            /**
//             *  执行目标方法
//             * @param proxy 代理对象，给jdk使用，任何时候都不要操作此对象
//             * @param method 当前将要执行的目标对象的方法
//             * @param args 这个方法调用时外界传入的参数值
//             * @return
//             * @throws Throwable
//             */
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                //利用反射执行目标方法,目标方法执行后的返回值
//                Object result = null;
//                try{
//                    LogUtil.start();
//                    result = method.invoke(calculator,args);
//                    LogUtil.stop();
//                }catch(Exception e){
//                    LogUtil.logException();
//                }finally{
//                    LogUtil.end();
//                }
//                return result;
//            }
//        };
//
//        Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
//        return (Calculator)proxy;
//    }
//}
