package com.cyx.spring_java_config._02_di;

import com.cyx.spring_java_config._02_di.beans.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig({BConfig.class, CConfig.class})
public class DITest {

    @Test
    @DisplayName("测试依赖注入")
    void testDI() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BConfig.class);
        System.out.println("bBean1：" + context.getBean("bBean1", BBean_1.class).getBBean());
        System.out.println("bBean2：" + context.getBean("bBean2", BBean_2.class).getBBean());
        System.out.println("bBean3：" + context.getBean("bBean3", BBean_3.class).getBBean());
    }

    @Test
    @DisplayName("依赖的 Bean 有多个相同类型的 Bean")
    void testSameType() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CConfig.class);
        System.out.println("cBean1：" + context.getBean("cBean1", CBean_1.class).getCBean().getName());
        System.out.println("cBean2：" + context.getBean("cBean2", CBean_2.class).getCBean().getName());
        System.out.println("cBean3：" + context.getBean("cBean3", CBean_3.class).getCBean().getName());
    }

}
