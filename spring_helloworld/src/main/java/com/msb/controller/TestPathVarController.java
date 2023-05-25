package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


 /**
 * @PathVariable可以获取请求路径中的值
 *  在路径中要使用{变量名称}做标识
 *  在方法参数中可以添加@PathVariable做识别，如果路径中的名称跟参数的名称不一致的时候，可以添加路径中的变量名称
 *  推荐添加
 * @param id
 * @param name
 * @return
  * 请求路径：http://localhost:8080/pathVariable/3/jack
 */

@Controller
public class TestPathVarController {
    @RequestMapping("/pathVariable/{id}/{name}")
    public String pathVariable(@PathVariable("id")Integer id,@PathVariable("name")String name){
        System.out.println(id);
        System.out.println(name);
        return "testPath";
    }
}
