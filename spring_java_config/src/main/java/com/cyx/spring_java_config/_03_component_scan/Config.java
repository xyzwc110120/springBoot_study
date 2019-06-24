package com.cyx.spring_java_config._03_component_scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    XML 配置：
        <context:component-scan base-package="com.cyx.spring._15_stereotype_annotation" />

    注解配置：
        @ComponentScan 注解，IoC 注解解析器，自动完成 Spring 组件扫描
        （默认情况下，@ComponentScan 会扫描被标注的类所在包及其子包中的所有类）
            basePackages 属性：需要扫描的包及其子包；
            value 属性：查看源码，发现与 basePackages 属性一样。

    推荐结构：作为主配置对象的类，一般把它放在根目录下（如：com.cyx.spring_java_config）
*/
@Configuration
@ComponentScan
public class Config {
}
