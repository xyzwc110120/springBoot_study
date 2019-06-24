package com.cyx.spring_java_config._01_bean;

import com.cyx.spring_java_config._01_bean.beans.ABean_1;
import com.cyx.spring_java_config._01_bean.beans.ABean_2;
import com.cyx.spring_java_config._01_bean.beans.ABean_2Factory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/*
    @SpringJUnitConfig 注解：
        声明一个基于 JUnit 5 的 Spring 测试类：
            classes 属性：需要引入的配置文件；
            value 属性：与 classes 属性一致。
*/
@SpringJUnitConfig(classes = Config.class)
public class BeanTest {

    @Test
    @DisplayName("获取 bean 对象")
    void testGetBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBean("aBean1", ABean_1.class));
        System.out.println(context.getBean("aBean2Factory", ABean_2.class));

        // 获得工厂对象，在 name 参数上加上前缀 “&”
        System.out.println(context.getBean("&aBean2Factory", ABean_2Factory.class));
    }

}
