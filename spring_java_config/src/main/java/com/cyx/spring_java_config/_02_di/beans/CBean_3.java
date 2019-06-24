package com.cyx.spring_java_config._02_di.beans;

import lombok.Getter;

@Getter
public class CBean_3 {

    private CBean cBean;

    public CBean_3(CBean cBean) {
        this.cBean = cBean;
    }
}
