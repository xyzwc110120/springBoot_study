package com.cyx.spring.springboot._09_interceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class InterceptorController {

    @RequestMapping("/interceptor")
    public void interceptor() {
    }
}
