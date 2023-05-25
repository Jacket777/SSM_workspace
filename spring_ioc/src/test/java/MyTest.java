/**
 * Created by 17081290 on 2020/11/3.
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.msb.bean.Address;
import com.msb.bean.Person;
import com.msb.bean.PersonA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class MyTest {
    public static void main(String[] args) throws SQLException{
        //ApplicationContext:表示ioc容器
        //ClassPathXmlApplicationContext:表示从当前classpath路径中获取xml文件的配置
        //根据spring的配置文件来获取ioc容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        //1.通过bean的id获取IOC容器中的对象
        //Person person = (Person)context.getBean("person");
        //2.通过bean类型获取获取IOC容器中的对象
        //Person person = context.getBean(Person.class);
        //3.通过bean的类型在查找对象的时候，在配置文件中不能存在两个类型一致的bean对象，如果有的话，可以通过如下方法
        //Person person = context.getBean("person6",Person.class);
        //System.out.println(person);
        //4.复杂的对象
        //PersonA personA = context.getBean("personA",PersonA.class);
        //System.out.println(personA);
        //5.继承关系
        //Person person = context.getBean("person10",Person.class);

        //静态工厂方法
        //Person person = context.getBean("person13",Person.class);
        //实例工厂方法创建
        //Person person = context.getBean("person14",Person.class);
        //System.out.println(person);

        //bean对象的初始化和销毁方法
        //Address address = context.getBean("address4",Address.class);
        //System.out.println(address);
        //((ClassPathXmlApplicationContext)context).close();

        //
        DruidDataSource dataSource = context.getBean("dataSource2",DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());

//        PersonA personA = context.getBean("personA23",PersonA.class);
//        System.out.println(personA);
    }
}
