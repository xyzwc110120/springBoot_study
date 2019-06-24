package com.cyx.spring_java_config._08_customize_conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

public class MyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取指定注解的所有属性
        MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(IsExist.class.getName());
        if (attrs != null) {
            // 按照属性名获取对应属性的值的值
            /* 注意：public List<V> get(Object key) 这里返回的是一个 List 集合，所以要遍历获取属性值 */
            for (Object value : attrs.get("value")) {
                // 将获得的属性值强转回原来的类型
                Class<?>[] classes = (Class<?> []) value;
                for (Class<?> clz : classes) {
                    if (context.getBeanFactory().getBeansOfType(clz).size() > 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}