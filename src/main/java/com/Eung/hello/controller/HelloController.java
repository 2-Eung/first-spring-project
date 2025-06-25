package com.Eung.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello() { // 이것에 대응하는 html 파일을 resources.templates 에 만들어야한다.
        return "hello";
    }
    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }
}
