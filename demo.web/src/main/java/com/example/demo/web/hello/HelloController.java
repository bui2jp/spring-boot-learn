package com.example.demo.web.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello2")
    public String hello(){
        return "hello";
    }
}
