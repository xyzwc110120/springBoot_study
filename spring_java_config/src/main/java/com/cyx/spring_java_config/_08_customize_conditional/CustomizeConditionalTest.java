package com.cyx.spring_java_config._08_customize_conditional;

import com.cyx.spring_java_config._08_customize_conditional.beans.FBeanChild;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Config.class)
public class CustomizeConditionalTest {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("测试自定义条件过滤注解")
    void testCustomizeConditional() {
        System.out.println(context.getBeansOfType(FBeanChild.class).size() > 0);
    }

}
