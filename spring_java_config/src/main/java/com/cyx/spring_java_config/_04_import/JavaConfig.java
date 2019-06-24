package com.cyx.spring_java_config._04_import;

import com.cyx.spring_java_config._04_import.beans.EBean_1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public EBean_1 eBean1() {
        return new EBean_1();
    }
}
