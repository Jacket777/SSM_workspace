package com.msb.factory;
import com.msb.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by 17081290 on 2021/6/8.
 * 实现FactoryBean的接口类是Spring中可以识别的工厂类，spring会自动调用工厂方法创建实例
 *
 */
public class MyFactoryBean implements FactoryBean<Person> {

    /**
     * 工厂方法，返回需要创建的对象
     * @return
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setName("marry");
        System.out.println("I create person");
        return person;
    }


    /**
     * 返回创建对象的类型，spring会自动调用该方法返回对象的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    /**
     * 创建对象是否单例对象
     * @return
     */
    @Override
    public boolean isSingleton(){
        return false;
    }
}
