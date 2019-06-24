package com.cyx.spring_java_config._08_customize_conditional;

import com.cyx.spring_java_config._08_customize_conditional.beans.FBean;
import com.cyx.spring_java_config._08_customize_conditional.beans.FBeanChild;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public FBean fBean() {
        return new FBean();
    }

    @IsExist({FBean.class})
    @Bean
    public FBeanChild fBeanChild() {
        return new FBeanChild();
    }
}
