package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1. 원격 프로그램으로 등록
//2. url과 메서드 연결
@Controller
public class HelloController { //원격 프로그램
    @RequestMapping("/hello")
    public void main(){
        System.out.println("hello");
        System.out.println("git test");
    }
}
