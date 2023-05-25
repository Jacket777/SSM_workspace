package com.msb.factory;

import com.msb.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * /**
 * 实现了FactoryBean接口的类是Spring中可以识别的工厂类，spring会自动调用工厂方法创建实例
 */
public class MyFactoryBean implements FactoryBean<Person>{
    /**
     * 工厂方法，返回需要创建的对象
     * @return
     * @throws Exception
     */
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setName("max");
        return person;
    }

    /**
     * 返回创建对象的类型,spring会自动调用该方法返回对象的类型
     * @return
     */
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 创建的对象是否是单例对象
     * @return
     */
    public boolean isSingleton() {
        return false;
    }
}
