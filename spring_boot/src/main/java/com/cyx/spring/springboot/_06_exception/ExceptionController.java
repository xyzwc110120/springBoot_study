package com.cyx.spring.springboot._06_exception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class ExceptionController {

    @RequestMapping("/exception")
    public void exception() {
        int i = 1 / 0;
    }
}
