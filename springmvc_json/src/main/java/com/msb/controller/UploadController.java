package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by 17081290 on 2021/1/4.
 * 测试通过
 */
@Controller
public class UploadController {
    @RequestMapping("/upload")
    //file与jsp页面对应， desc也与jsp页面对应
    public String upload(@RequestParam("file")MultipartFile[]multipartFile, @RequestParam(value="desc",required = false)String desc)
    throws IOException{
        System.out.println(desc);
        //获取文件的名称
        for(MultipartFile file:multipartFile){
            if(!file.isEmpty()){
                //获取文件的名称
                System.out.println(file.getOriginalFilename());
                //将获取的文件写到指定路径
                file.transferTo(new File("d:\\file\\"+file.getOriginalFilename()));
            }
        }
        return "success";

    }
}
