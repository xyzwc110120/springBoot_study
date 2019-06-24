package com.cyx.spring_java_config._05_property_source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @PropertySource 标签：引入需要加载的资源文件
@PropertySource("classpath:db.properties")
public class AppConfig {

    // @Value 标签：为字段设置值，相当于：<property name="driverClassName" value="${属性占位符}" />
    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public MyDataSource myDataSource() {
        return new MyDataSource(driverClassName, url, username, password);
    }
}
