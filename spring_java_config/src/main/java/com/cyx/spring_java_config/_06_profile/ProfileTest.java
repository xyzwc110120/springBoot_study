package com.cyx.spring_java_config._06_profile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
/*
    @ActiveProfiles 注解：
        使用哪一组侧写（组件）。注意：未被选中的组件不会被 Spring 初始化。
*/
@ActiveProfiles("test")
public class ProfileTest {

    @Autowired
    private MyDataSource myDataSource;

    @Test
    @DisplayName("使用 @Profile 注解来为不同环境的配置文件分组")
    void testProfile() {
        System.out.println(myDataSource);
    }

}
