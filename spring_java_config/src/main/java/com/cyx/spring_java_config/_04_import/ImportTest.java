package com.cyx.spring_java_config._04_import;

import com.cyx.spring_java_config._04_import.beans.EBean_1;
import com.cyx.spring_java_config._04_import.beans.EBean_2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class ImportTest {

    @Autowired
    private EBean_1 eBean1;
    @Autowired
    private EBean_2 eBean2;

    @Test
    @DisplayName("测试引入配置对象和文件")
    void testImport() {
        System.out.println(eBean1);
        System.out.println(eBean2);
    }
}
