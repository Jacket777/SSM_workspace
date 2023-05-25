import com.msb.inter.Calculator;
import com.msb.inter.MyCalculator;
import com.msb.inter.MyCalculator2;
import com.msb.inter.MyCalculator3;
import com.msb.proxy.CalculatorProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 17081290 on 2020/11/19.
 */
public class MyTest {
//    @Test
//    public void test01(){
//        MyCalculator myCalculator = new MyCalculator();
//        System.out.println(myCalculator.add(1, 2));
//    }


//    @Test
//    public void test02(){
//        //使用Java 动态代理
//        Calculator calculator = CalculatorProxy.getProxy(new MyCalculator());
//        calculator.add(1,1);
//        System.out.println(calculator.getClass());
//    }


//    @Test
//    public void test03(){
//        //使用cglib 动态代理
//        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
//        MyCalculator2 bean = context.getBean(MyCalculator2.class);
//        bean.div(1,1);
//        System.out.println(bean);
//        System.out.println(bean.getClass());
//    }


    @Test
    public void test04(){
        //使用AOP配置
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        MyCalculator3 bean = context.getBean(MyCalculator3.class);
        bean.div(1,1);
        System.out.println(bean);
        System.out.println(bean.getClass());
    }


}
