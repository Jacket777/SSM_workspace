package com.msb.controller;

import com.msb.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 17081290 on 2020/12/28.
 * 数据校验
 */
@Controller
public class ValidationController {
    @Validated
    @RequestMapping("/validation")
    public String validate(@Valid Person person, BindingResult bindingResult, Model model) {
        System.out.println(person);
        Map<String, Object> map = new HashMap<String, Object>();
        if (bindingResult.hasErrors()) {
            System.out.println("登录失败");
            //获取当前所有错误
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getField());
                System.out.println(fieldError.getDefaultMessage());
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            model.addAttribute("errors", map);
            return "forward:/login.jsp";
        } else {
            System.out.println("登录成功");
            return "success";
        }
    }










//    @Validated
//    @RequestMapping("/validation")
//    public String validate(@Valid Person person, BindingResult bindingResult, Model model) {
//        System.out.println(person);
//        Map<String, Object> map = new HashMap<String, Object>();
//        if (bindingResult.hasErrors()) {
//            System.out.println("登录失败");
//            //获取当前所有错误
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            for (FieldError fieldError : fieldErrors) {
//                System.out.println(fieldError.getField());
//                System.out.println(fieldError.getDefaultMessage());
//                map.put(fieldError.getField(), fieldError.getDefaultMessage());
//            }
//            model.addAttribute("errors", map);
//            return "forward:/login.jsp";
//        } else {
//            System.out.println("登录成功");
//            return "success";
//        }
//    }
//
//


}
