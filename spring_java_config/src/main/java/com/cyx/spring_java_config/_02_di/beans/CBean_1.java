package com.cyx.spring_java_config._02_di.beans;

import lombok.Getter;

@Getter
public class CBean_1 {

    private CBean cBean;

    public CBean_1(CBean cBean) {
        this.cBean = cBean;
    }
}
