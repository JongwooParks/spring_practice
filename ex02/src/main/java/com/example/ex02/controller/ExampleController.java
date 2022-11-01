package com.example.ex02.controller;

import com.example.ex02.domain.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

@Controller
@Slf4j
@RequestMapping("/ex/*")
public class ExampleController {
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

    @RequestMapping(value = "ex01", method = {RequestMethod.GET, RequestMethod.POST})
    public void ex01(){
        log.info("ex01...........");
    }

    @GetMapping("ex02")
    public void ex02(HttpServletRequest request){
        log.info("name: " + request.getParameter("name"));
    }

    @GetMapping("ex03")
    public void ex03(String name){
        log.info("name: " + name);
    }

    @GetMapping("ex04")
    public void ex04(MemberVO memberVO){
        log.info("member: " + memberVO);
    }

    @GetMapping("ex05")
    public void ex05(@RequestParam("id") String name, int age){
        log.info("name: " + name);
        log.info("age " + age);
    }
    @GetMapping("ex06")
    public void ex06(MemberVO memberVO){
        log.info("ex06................");
    }

    @GetMapping("ex07")
    public void ex07(@ModelAttribute("gender") String gender, MemberVO memberVO){
        log.info("ex07........................");
        log.info("memberVO: "+memberVO);
        log.info("gender: "+gender);


    }

//    외부에서 상품명, 상품가격, 상품재고, 브랜드 전달받아서 화면에 전송
//    화면에서 4개정보 입력후 form태그로 전송한다.
    @GetMapping("ex08")
    public void ex08(ProductVO productVO){
        log.info("ex08................");
        log.info("productVO: "+productVO);
    }
    @GetMapping("ex08_1")
    public void ex08_1(){
        log.info("ex08_1");
    }

    @GetMapping("ex09_1")
    public void ex09_1(){
        log.info("ex09_1");
    }
    @GetMapping("ex09")
    public void ex09(TaskVO taskVO){
        log.info("ex09...........");
    }
    @GetMapping("login")
    public String login(UserVO userVO){

        if(userVO.getId().equals("admin")){
            return "ex/admin";
        }
        if(userVO.getId().equals("user")){
            return "ex/user";
        }
        return null;
    }
    @GetMapping("test03")
    public String login(){
        return "ex/login";
    }
    @GetMapping("work")
    public void work(){
        log.info("work........");
    }

    @GetMapping("test04")
    public String getWorkTest(WorkVO workVO){
        log.info(workVO+"");
        if(workVO.getGoCheck()){
            return "ex/late";
        }else{
            return "ex/getToWork";
        }
    }
    @GetMapping("test041")
    public String getLeaveTest(WorkVO workVO){
        log.info(workVO+"");
        if(workVO.getLeaveCheck()){
            return "ex/getToWork";
        }else{
            return "ex/leaveWork";
        }
    }

    //    [실습 2]
//    TaskVO 선언
//    int num, int kor, int eng, int math 선언
//    총점과 평균 점수 화면에 출력
    @GetMapping("/exam")
    public String exam(){
        return "exam/exam";
    }

    @PostMapping("/exam")
    public String exam(TaskVO taskVO, Model model){
        return "exam/result";
    }






}



















