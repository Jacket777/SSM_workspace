package com.msb.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by 17081290 on 2020/11/3.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 在初始化方法调用之前执行
     * @param bean  初始化的bean对象
     * @param beanName  xml配置文件中的bean的id属性
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{
        System.out.println("postProcessBeforeInitializatio: "+beanName+"调用初始化前置方法");
        return bean;
    }

    /**
     * 在初始化方法调用之后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean,String beanName)throws BeansException{
        System.out.println("postProcessAfterInitialization: "+beanName+"调用初始化后缀方法");
        return bean;
    }

}
