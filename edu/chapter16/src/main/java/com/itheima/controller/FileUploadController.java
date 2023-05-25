package com.itheima.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

/**
 * Created by 17081290 on 2021/5/15.
 * 文件上传
 */
@Controller
public class FileUploadController {
    @RequestMapping("/fileUpload")
    public String handleFormUpload(@RequestParam("name") String name,
                                   @RequestParam("uploadfile") List<MultipartFile> uploadfile,
                                   HttpServletRequest request) {
        //判断所上传文件是否存在
        if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
            //循环输出上传文件
            for (MultipartFile file : uploadfile) {
                //获取上传文件的原始名称
                String originalFilename = file.getOriginalFilename();
                //设置上传文件保存地址目录
                String dirPath = request.getServletContext().getRealPath("/upload/");
                //如果保存文件地址不存在，则先创建目录
                File filePath = new File(dirPath);
                if (!filePath.exists()) {
                    filePath.mkdirs();
                }

                //使用UUID重新命名上传的文件名称(上传人_uuid_原始文件名称)
                String newFileName = name + "_" + UUID.randomUUID() + "_" + originalFilename;
                //使用MutipartFile接口方式完成上传到指定位置
                try {
                    file.transferTo(new File(dirPath + newFileName));
                } catch (IOException e) {
                    e.printStackTrace();
                    return "error";
                }
                return "success";

            }
        }
        return "error";
    }


    @RequestMapping("/download")
    public ResponseEntity<byte[]>fileDownload(HttpServletRequest request,
                                              String filename)throws Exception{
        //指定要下载的文件所在路径
        String path = request.getServletContext().getRealPath("/upload/");
        //创建文件对象
        File file = new File(path+File.separator+filename);
        //设置响应头
        HttpHeaders headers = new HttpHeaders();
        //通知浏览器以下载方式打开(下载前对文件名进行转码)
        filename = getFileName(request,filename);
        headers.setContentDispositionFormData("attachment",filename);
        //定义以流的形式下载返回文件数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        try {
            return new ResponseEntity<>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<byte[]>(e.getMessage().getBytes(), HttpStatus.EXPECTATION_FAILED);
        }
    }



    //根据浏览器的不同进行编码设置，返回编码后的文件名
    public String getFileName(HttpServletRequest request,String filename)throws Exception{
        //IE不同版本User-Agent中出现的关键词
        String[]IEBrowserKeyWords = {"MSIE","Trident","Edge","Mozilla","AppleWebKit","Chrome","Safari"};
        String userAgent = request.getHeader("User-Agent");
        for(String keyword:IEBrowserKeyWords){
            if(userAgent.contains(keyword)){
                System.out.println("==========XXXXX=======");
                //IE内核浏览器，统一为UTF-8编码，并对转换的+进行更正
                return URLEncoder.encode(filename,"UTF-8").replace("_"," ");
            }
        }
        System.out.println("==========火狐与其他=======");
        //火狐等其他浏览器统一为ISO-8859-1编码显示
        return new String(filename.getBytes("UTF-8"),"ISO-8859-1");

    }
}
