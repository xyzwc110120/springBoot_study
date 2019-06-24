package com.cyx.spring_java_config._02_di.beans;

import lombok.Getter;

@Getter
public class CBean_2 {

    private CBean cBean;

    public CBean_2(CBean cBean) {
        this.cBean = cBean;
    }
}
