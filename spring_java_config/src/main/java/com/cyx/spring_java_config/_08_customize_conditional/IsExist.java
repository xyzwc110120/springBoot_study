package com.cyx.spring_java_config._08_customize_conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    查看 @Profile 注解源码：

        @Target({ElementType.TYPE, ElementType.METHOD})
        @Retention(RetentionPolicy.RUNTIME)
        @Documented
        @Conditional(ProfileCondition.class)
        public @interface Profile {
            String[] value();
        }

    可以看到，在 Profile 注解中引用了 @Conditional 注解，而 @Profile 注解标注的切面中的 Bean 是否实例化，
    就是由 @Conditional 注解中的 ProfileCondition 类来决定的。


    查看 ProfileCondition 类源码：

        class ProfileCondition implements Condition {
            @Override
            public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
                // 获取 Profile 注解全部属性，key 对应属性名，value 对应属性值
                MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(Profile.class.getName());
                if (attrs != null) {
                    // 获取 value 属性值，并进行遍历
                    for (Object value : attrs.get("value")) {
                        // 若切面匹配上则进行实例化
                        if (context.getEnvironment().acceptsProfiles(Profiles.of((String[]) value))) {
                            return true;
                        }
                    }
                    // 若没有匹配上则不进行实例化
                    return false;
                }
                return true;
            }
        }
*/


/**
 * 自定义条件过滤注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Conditional({MyCondition.class})
public @interface IsExist {

    /**
     * @return 需要判断的 Bean，在 Spring 容器中是否存在
     */
    Class<?>[] value();

}
