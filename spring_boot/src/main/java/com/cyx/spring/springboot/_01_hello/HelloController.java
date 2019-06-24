package com.cyx.spring.springboot._01_hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class HelloController {

    // 注入 SpringBoot 上下文中的参数对象
    @Autowired
    private ApplicationArguments applicationArguments;

    @RequestMapping("/hello")
    public String hello() {
        // 打印上下文中的参数
        System.out.println(applicationArguments.getNonOptionArgs());
        return "Hello Spring Boot!!!";
    }
}