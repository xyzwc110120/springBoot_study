package com.cyx.spring_java_config._02_di.beans;

import lombok.Getter;

@Getter
public class CBean {

    private String name;

    public CBean(String name) {
        this.name = name;
    }
}
