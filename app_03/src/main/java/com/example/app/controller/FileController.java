package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/file/*")
public class FileController {

    @GetMapping("upload")
    public void upload(MultipartFile[] upload){
        String uploadPath = "C:/upload";

        File file = new File(uploadPath, createDirectoryByNow());
        if(!file.exists()){
            file.mkdirs();
        }
    }

    public String createDirectoryByNow(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date now = new Date();
        return format.format(now);
    }
}
