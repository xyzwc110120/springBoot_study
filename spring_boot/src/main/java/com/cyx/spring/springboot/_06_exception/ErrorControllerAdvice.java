package com.cyx.spring.springboot._06_exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, HandlerMethod handlerMethod) {
        System.out.println(e.getMessage());
        System.out.println(handlerMethod.getBean().getClass());
        System.out.println(handlerMethod.getMethod().getName());
        return "error";
    }
}
