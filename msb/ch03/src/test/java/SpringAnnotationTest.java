import com.msb.controller.PersonController;
import com.msb.dao.PersonDao;
import com.msb.service.PersonService;
import com.msb.service.StudentService;
import com.msb.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2021/6/10.
 */
public class SpringAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.save();
        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        teacherService.save();
    }
}