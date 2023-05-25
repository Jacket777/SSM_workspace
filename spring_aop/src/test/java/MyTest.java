import com.msb.service.MyCalculator2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by 17081290 on 2020/11/13.
 */
public class MyTest {
//    @Test
//    public void test01() throws NoSuchMethodException {
////        MyCalculator myCalculator = new MyCalculator();
////        System.out.println(myCalculator.add(1,2));
//      //  Proxy.newProxyInstance()
//        Calculator calculator = CalculatorProxy.getProxy(new MyCalculator());
//        calculator.add(1,1);
//        System.out.println(calculator.getClass());
//        calculator.div(1,0);
//    }


//   @Test
//    public void test02()throws NoSuchMethodException{
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MyCalculator calculator = context.getBean(MyCalculator.class);
//       //Calculator calculator = context.getBean(Calculator.class);
//       System.out.println(calculator.getClass()+" ");
//        calculator.div(1,10);
//        System.out.println("=============");
//       System.out.println("使用cglib方式做代理对象，不需要实现任何接口，注意代理对象的不同");
//       MyCalculator2 bean = context.getBean(MyCalculator2.class);
////       System.out.println(bean);
//       System.out.println(bean.getClass());
//       //bean.add(1,2);
//    }




    @Test
    public void test03() throws NoSuchMethodException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCalculator2 myCalculator2 = context.getBean("myCalculator2", MyCalculator2.class);
        myCalculator2.add(1,1);
    }

}
