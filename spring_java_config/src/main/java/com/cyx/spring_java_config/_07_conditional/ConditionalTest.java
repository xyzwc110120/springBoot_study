package com.cyx.spring_java_config._07_conditional;

import com.cyx.spring_java_config._07_conditional.beans.FBeanChild;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Config.class)
public class ConditionalTest {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("测试匹配注解，若 Spring 容器中不存在 FBeanChild 所依赖的 FBean，则不对 FBeanChild 进行实例化")
    void testCondition() {
        System.out.println(context.getBeansOfType(FBeanChild.class).size() > 0);
    }

}
