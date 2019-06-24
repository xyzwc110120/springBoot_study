package com.cyx.spring_java_config._06_profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/*
    @Profile 注解：
        配置侧写，意思是为被标注的类贴上一个标签，所有拥有相同标签的类会被认为是一个组合，
        这样就可以根据不同的环境需要来使用不同的组合。
*/
@Configuration
@PropertySource("classpath:com/cyx/spring_java_config/_06_profile/db-dev.properties")
@Profile("dev")
public class DevConfig {
}
