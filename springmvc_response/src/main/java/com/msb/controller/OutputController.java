package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by 17081290 on 2020/12/25.
 * 在页面回显数据的时候，可以在方法的参数中显示的声明
 * Map:
 * ModelMap
 * Model
 * 都可以将数据进行回显，回显之后数据是保存在哪个作用域？
 * page: 当前页面
 * request：当前请求---放在该作用域中
 * session：当前会话
 * application：当前应用
 * 当使用上述
 *
 */
@Controller
//@SessionAttributes("username")  //表示将username放到session中
//@SessionAttributes(value={"username","msg"})  //表示将username放到session中
//@SessionAttributes(value={"username","msg"},types =Integer.class) //type是传的参数的类型
@SessionAttributes(types=String.class)
public class OutputController {

    @RequestMapping("/output")
    public String output(Map<String,String>map){
        map.put("msg","hello spring mvc");
        System.out.println(map.getClass()+"-----");
        return "success";
    }

    @RequestMapping("/output2")
    public String output(Model model){
        model.addAttribute("msg1","hello spring mvc model");
        System.out.println(model.getClass()+"=======");
        return "success";
    }




    @RequestMapping("/output3")
    public String output3(ModelMap modelMap){
        modelMap.addAttribute("msg2","hello spring mvc modelMap");
        System.out.println(modelMap.getClass()+"===>>>====");
        return "success";
    }

    @RequestMapping("/output4")
    public ModelAndView output4(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("msg3","hello spring mvc modelANDView");
        System.out.println(mv.getClass()+"===>>>====");
        return mv;
    }


    /**
     * 当需要向session中设置数据的时候，可以在当前Controller上添加@SessionAttributes注解，
     * 此注解表示，每次在向request作用中设置属性值的时候，顺带着向session中保存一份
     * @SessionAttributes(value={"username","msg"},types =Integer.class) //type是传的参数的类型
     * value和type都写上之后表示session中可以存储名字为value值的参数以及类型为Integer的参数
     * @SessionAttributes(types=String.class)
     * value和type可以分开单独使用，但是尽量不要使用type类型，因为会把所有符合类型的数据都设置到session中，导致session异常
     * @param model
     * @return
     */
    @RequestMapping("/testSession")
    public String testSession(Model model){
        model.addAttribute("username","zhangsan");
        return "success";
    }

}

