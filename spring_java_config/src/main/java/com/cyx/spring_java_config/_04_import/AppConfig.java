package com.cyx.spring_java_config._04_import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
// 引入配置对象
@Import(JavaConfig.class)
// 引入配置文件（注意：查看源码可发现 @ImportResource 注解中 value 属性和 locations 属性是一样的）
@ImportResource("classpath:com/cyx/spring_java_config/_04_import/XmlConfig.xml")
public class AppConfig {
}
