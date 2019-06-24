package com.cyx.spring_java_config._02_di;

import com.cyx.spring_java_config._02_di.beans.CBean;
import com.cyx.spring_java_config._02_di.beans.CBean_1;
import com.cyx.spring_java_config._02_di.beans.CBean_2;
import com.cyx.spring_java_config._02_di.beans.CBean_3;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// 若依赖的对象有多个同类型的 Bean
@Configuration
public class CConfig {

    @Primary
    @Bean
    public CBean cBeanOne() {
        return new CBean("cBeanOne");
    }
    @Bean
    public CBean cBeanTwo() {
        return new CBean("cBeanTwo");
    }

    // 方式一：通过 @Qualifier 指定 Bean 的 id
    @Bean
    public CBean_1 cBean1(@Qualifier("cBeanTwo") CBean cBean) {
        return new CBean_1(cBean);
    }

    // 方式二：使用 @Primary 注解，自动装配时当出现多个 Bean 候选者时，被注解为 @Primary 的 Bean 将作为首选者
    @Bean
    public CBean_2 cBean2(CBean cBean) {
        return new CBean_2(cBean);
    }

    // 方式三：Spring 会自动根据参数的类型和参数名去找对应类型和 id 的 Bean
    @Bean
    public CBean_3 cBean3(CBean cBeanTwo) {
        return new CBean_3(cBeanTwo);
    }
}
