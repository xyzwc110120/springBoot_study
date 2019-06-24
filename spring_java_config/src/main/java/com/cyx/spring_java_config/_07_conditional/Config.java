package com.cyx.spring_java_config._07_conditional;

import com.cyx.spring_java_config._07_conditional.beans.FBean;
import com.cyx.spring_java_config._07_conditional.beans.FBeanChild;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    /*
        注意：
            Spring 会按照顺序加载 Bean，若 FBean 在 FBeanChild 后面，则在 @Conditional 注解判断 FBean 是否存在时，
            FBean 还没有被 Spring 加载进容器。
    */
    @Bean
    public FBean fBean() {
        return new FBean();
    }

    /*
        @Conditional 注解：
            条件注解，注解中的参数为一个实现了 org.springframework.context.annotation.Condition 接口的类。
            该类实现了 Condition 接口中的 boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata)（匹配）方法，
            若该方法返回 false，则 Spring 会忽略该注解所标注的 Bean，而不实例化；若返回 true，则正常实例化。
    */
    @Conditional(MyCondition.class)
    @Bean
    public FBeanChild fBeanChild() {
        return new FBeanChild();
    }



}
