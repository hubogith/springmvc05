package com.hb.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController implements ServletContextAware {
    private ServletContext application;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.application=servletContext;
    }

    @RequestMapping("/upload.action")
    public String upload(MultipartFile file) throws IOException {
        //获取上传文件地址
        String realPath = application.getRealPath("/photo");

        System.out.println(realPath+"=========0+");
        String filename = file.getOriginalFilename();

        File files=new File(realPath,filename);
        System.out.println(files);

        file.transferTo(files);
        return "succes";
    }
}
