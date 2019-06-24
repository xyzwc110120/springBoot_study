package com.cyx.spring_java_config._03_component_scan.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter@Setter
@Component
public class DBeanChild {

    private final DBean dBean;

    @Autowired
    public DBeanChild(DBean dBean) {
        this.dBean = dBean;
    }
}
