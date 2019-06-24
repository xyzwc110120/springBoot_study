package com.cyx.spring_java_config._05_property_source;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class PropertySourceTest {

    @Autowired
    private MyDataSource myDataSource;

    @Test
    @DisplayName("加载资源文件并获取对应的值")
    void testPropertySource() {
        System.out.println(myDataSource);
    }
}
