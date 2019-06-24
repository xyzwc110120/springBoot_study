package com.cyx.spring_java_config._01_bean;

import com.cyx.spring_java_config._01_bean.beans.ABean_1;
import com.cyx.spring_java_config._01_bean.beans.ABean_2Factory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    /*
        XML 配置：
            <bean id="aBean1" class="com.cyx.spring._06_bean_lifecycle.FBean" init-method="init" destroy-method="close" />

        @Bean 注解配置：
            id：注解标注的方法名就为 id 值；
            class：注解标注的方法的返回值就为 class 值；
            initMethod 属性：初始化方法；
            destroyMethod 属性：销毁方法；

    */
    @Bean(initMethod = "init", destroyMethod = "close")
    public ABean_1 aBean1() {
        return new ABean_1();
    }

    @Bean
    public ABean_2Factory aBean2Factory() {
        return new ABean_2Factory();
    }
}
