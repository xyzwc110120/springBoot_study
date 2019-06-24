package com.cyx.spring_java_config._03_component_scan;

import com.cyx.spring_java_config._03_component_scan.beans.DBeanChild;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Config.class)
public class ComponentScanTest {

    @Autowired
    private DBeanChild dBeanChild;

    @Test
    @DisplayName("测试自动扫描并注入")
    void testComponentScan() {
        System.out.println(dBeanChild.getDBean());
    }

}
