
import com.alibaba.druid.pool.DruidDataSource;
import com.msb.bean.PersonA;
import com.msb.bean.complex.Address;
import com.msb.dao.impl.UserDaoMySqlImp;
import com.msb.dao.impl.UserDaoOracleImpl;
import com.msb.factory.MyFactoryBean;
import com.msb.service.UserService;
import com.msb.service.impl.UserServiceImpl;
//import com.msb.bean.complex.Person;
import com.msb.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2020/12/3.
 */
public class MyTest {

//    @Test
//    public void test01(){
//        UserService service = new UserServiceImpl();
//        service.getUser();
//    }

    /**
     * 第二种方案
     */
//    @Test
//    public void test02(){
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoMySqlImp());
//        userService.getUser();
//
//        userService.setUserDao(new UserDaoOracleImpl());
//        userService.getUser();
//    }

    /**
     * 靠空的构造器进行对象构造
     */
//    @Test
//    public void test03(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = (Person)context.getBean("person");
//        System.out.println(person);
//    }


    /**
     * 利用实际构造器进行构造
     */
//    @Test
//    public void test04(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = (Person)context.getBean("person");
//        System.out.println(person);
//        Person person2 = (Person)context.getBean("person2");
//        System.out.println(person2);
//        Person person3 = (Person)context.getBean("person3");
//        System.out.println(person3);
//        PersonA person4A = (PersonA)context.getBean("person4A");
//        System.out.println(person4A);
//        Person person5 = (Person)context.getBean("person5");
//        System.out.println(person5);
//    }


    /**
     * 复杂类型
     */
//    @Test
//    public void test05(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person = (Person)context.getBean("person");
//        System.out.println(person);
//    }


    /**
     * 继承关系bean配置
     */
//    @Test
//    public void test06(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc3.xml");
//        Person person = (Person)context.getBean("person4");
//        System.out.println(person);
//    }


    /**
     * 测试 bean对象创建依赖关系
     */
//    @Test
//    public void test07(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person = (Person)context.getBean("person");
//        System.out.println(person);
//    }

    /**
     * bean单例测试
     */
//    @Test
//    public void test08(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc4.xml");
//        Person person01 = (Person)context.getBean("person");
//        Person person02 = (Person)context.getBean("person");
//
//        System.out.println(person01==person02);
//
//        Person person03 = context.getBean("person2",Person.class);
//        Person person04 = context.getBean("person2",Person.class);
//
//        System.out.println(person03==person04);
//    }


    /**
     * 工厂类创建对象
     */
//    @Test
//    public void test09(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc5.xml");
//        Person person05 = (Person)context.getBean("person5");
//        Person person06 = (Person)context.getBean("person6");
//        System.out.println("person05 === "+person05);
//        System.out.println("person06 === "+person06);
//    }


    /**
     * 继承FactoryBean来创建对象
     *
     */
//    @Test
//    public void test10() throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc5.xml");
//        //注意使用的类
//        Person myFactoryBean = context.getBean("myFactoryBean", Person.class);
//        System.out.println(myFactoryBean);
//    }

    /**
     * bean生命周期测试
     * bean 生命周期表示bean的创建到销毁
     如果bean是单例，容器在启动时候回创建好，关闭的时候销毁bean
     如果bean是多例，获取对象的时候创建对象，销毁的时候不会有任何的调用
     */

//    @Test
//    public void test11() throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc5.xml");
//        Address address = context.getBean("address", Address.class);
//        System.out.println(address);
//        //applicationContext没有close方法，需要使用具体的子类
//        ((ClassPathXmlApplicationContext)context).close();
//    }


//    @Test
//    public void test12() throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc6.xml");
//        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
//        System.out.println(dataSource);
//        System.out.println(dataSource.getConnection());
//    }


//    @Test
//    public void test13() throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc6.xml");
//        DruidDataSource dataSource = context.getBean("dataSource01", DruidDataSource.class);
//        System.out.println(dataSource);
//        System.out.println(dataSource.getUsername());
//        System.out.println(dataSource.getConnection());
//    }


    //自动装配测试
    @Test
    public void test14() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc6.xml");
        com.msb.bean.complex.Person person = context.getBean("person", com.msb.bean.complex.Person.class);
        System.out.println(person);
        com.msb.bean.complex.Person person2 = context.getBean("person2", com.msb.bean.complex.Person.class);
        System.out.println(person2);
        com.msb.bean.complex.Person person3 = context.getBean("person3", com.msb.bean.complex.Person.class);
        System.out.println(person3);
        System.out.println("============>>>>>==================");
        com.msb.bean.complex.Person person4 = context.getBean("person4", com.msb.bean.complex.Person.class);
        System.out.println(person4);

    }


}
