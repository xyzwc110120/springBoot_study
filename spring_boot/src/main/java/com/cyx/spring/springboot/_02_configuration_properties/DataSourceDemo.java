package com.cyx.spring.springboot._02_configuration_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter@Setter
@Component
/*
    @ConfigurationProperties 注解：
        获取资源文件中指定参数，并注入。
        查看源码可发现 value 属性和 prefix 一样，指定资源文件参数的前缀
*/
@ConfigurationProperties("db")
public class DataSourceDemo {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
