import com.msb.controller.BaseController;
import com.msb.controller.PersonController;
import com.msb.service.PersonService;

import com.msb.service.StudentService;
import com.msb.service.TeacherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2020/11/10.
 */
public class MyTest {
    //ApplicationContext:表示ioc容器
    //ClassPathXmlApplicationContext:表示从当前classpath路径中获取xml文件的配置
    //根据spring的配置文件来获取ioc容器对象
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test(){

        PersonController personController = context.getBean("personController",PersonController.class);
        //PersonController personController2 = context.getBean("personController",PersonController.class);
        //System.out.println(personController == personController2);
        personController.save();
    }

    @Test
    public void test02(){
//        BaseController baseController = context.getBean("baseController", BaseController.class);
//        baseController.save();
       // baseController.save2();
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.save();
        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        teacherService.save();

    }



}
