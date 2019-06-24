package com.cyx.spring.springboot.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {

    private Long id;
    private String account;
    private String password;
}
