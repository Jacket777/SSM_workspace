import com.msb.controller.PersonController;
import com.msb.controller.PersonController2;
import com.msb.service.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2020/12/8.
 */
public class MyTest {


    /**
     * 测试注解注入
     */
//    @Test
//    public void test01(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PersonController personController = context.getBean("personController", PersonController.class);
//    }



    /**
     * 测试注解：按照注解进行排除，标注了指定注解的组件不要
     * 此时下段测试代码报错，无法创建成功
     */
//    @Test
//    public void test02(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext01.xml");
//        PersonController personController = context.getBean("personController", PersonController.class);
//    }


    /**
     * 测试注解：按照注解进行排除，定排除某个具体的类，按照类排除，expression表示不注册的具体类名
     * 此时下段测试代码报错，无法创建成功
     */
//    @Test
//    public void test03(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext01.xml");
//        PersonService personService = context.getBean("personService", PersonService.class);
//    }


    /**
     * 测试注解：自动注入
     */
//    @Test
//    public void test04(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//       PersonController personController = context.getBean("personController", PersonController.class);
//        personController.getPerson();
//    }


    /**
     * 测试注解：自动装配
     */
//    @Test
//    public void test05(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PersonController2 personController2 = context.getBean("personController2", PersonController2.class);
//        personController2.getPerson();
//    }

//    @Test
//    public void test06(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        StudentService studentService = context.getBean("studentService", StudentService.class);
//        studentService.save();
//        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
//        teacherService.save();
//    }


    @Test
    public void test07(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService2 studentService = context.getBean("studentService2", StudentService2.class);
        studentService.save();
        TeacherService2 teacherService = context.getBean("teacherService2", TeacherService2.class);
        teacherService.save();
    }
}
