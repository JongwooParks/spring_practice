package com.example.app.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
@Slf4j
public class TestController {
    @GetMapping("test")
    public String test2(){
        return "board/Study";
    }

    @PostMapping("test")
    public void test(){

    }
}
