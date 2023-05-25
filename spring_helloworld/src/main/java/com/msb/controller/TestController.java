package com.msb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by 17081290 on 2020/12/10.
 * 基于注解的 spring mvc
 */
@Controller
@RequestMapping("/msb")
public class TestController {
       /*
    * @RequestMapping就是用来标识此方法用来处理什么请求，其中的/可以取消
    * 取消后默认也是从当前项目的根目录开始查找，一般在编写的时候看个人习惯
    * 同时，@RequestMapping也可以用来加在类上，
    * */
    @RequestMapping("/testAnonation")
    public String hello(Model model){
        model.addAttribute("msg","hello spring mvc test");
        return "testAnonation";
    }


    /**
     * method值为GET请求
     * @param model
     * @return
     */
    @RequestMapping(value="/testAnonation2",method= RequestMethod.GET)
    public String hello2(Model model){
        model.addAttribute("msg","测试 method方法");
        return "testAnonation";
    }


    /**
     * 测试参数方法
     * 参数方法限制参加名称，值
     * @param model
     * @return
     */
    @RequestMapping(value="/testAnonation3",params = {"username!=123","age"})
    public String hello3(Model model){
        model.addAttribute("msg","测试 params方法");
        return "testAnonation";
    }


    /**
     *
     * 浏览器限制
     * User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)
     * Chrome/78.0.3904.108
     * Safari/537.36
     */

    @RequestMapping(value="/testAnonation4",headers = {"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)  Safari/537.36"})
    public String hello4(Model model){
        model.addAttribute("msg","测试 header 限制浏览器方法");
        return "testAnonation";
    }



    /**
     * @Request包含三种模糊匹配的方式，分别是：
     *  ？：能替代任意一个字符
     *  *: 能替代任意多个字符和一层路径
     *  **：能代替多层路径
     * @return
     */

    @RequestMapping(value="/testAnonation4?")
    public String hello5(Model model){
        model.addAttribute("msg","测试模糊匹配方式--问号匹配");
        return "testAnonation";
    }



    /**
     * @Request包含三种模糊匹配的方式，分别是：
     *  *: 能替代任意多个字符和一层路径
     *  **：能代替多层路径
     * @return
     */

    @RequestMapping(value="/testAnonation4*")
    public String hello6(Model model){
        model.addAttribute("msg","测试模糊匹配方式--星号匹配");
        return "testAnonation";
    }


    /**
     * @Request包含三种模糊匹配的方式，分别是：
     *  *: 能替代任意多个字符和一层路径
     *  **：能代替多层路径
     * @return
     */

    @RequestMapping(value="/*/testAnonation4")
    public String hello7(Model model){
        model.addAttribute("msg","测试模糊匹配方式--星号匹配--一层路径匹配");
        return "testAnonation";
    }


    /**
     * @Request包含三种模糊匹配的方式，分别是：
     *  *: 能替代任意多个字符和一层路径
     *  **：能代替多层路径
     * @return
     */

    @RequestMapping(value="/**/testAnonation8")
    public String hello8(Model model){
        model.addAttribute("msg","测试模糊匹配方式--星号匹配--多层路径匹配");
        return "testAnonation";
    }


    public String helloMore(Map<String,String> map){
        map.put("hello","hello heihei");
        return "heihei";

    }

}
