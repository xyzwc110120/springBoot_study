package com.cyx.spring_java_config._07_conditional;

import com.cyx.spring_java_config._07_conditional.beans.FBean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

// 自定义一个匹配类
public class MyCondition implements Condition {

    /**
     * 确定条件是否匹配。
     *
     * @param context 条件上下文对象
     * @param metadata 当前被检查的类或方法的元数据
     * @return 是否匹配：true，被标注的 Bean 将被实例化；false，被标注的类将被忽略，不做实例化。
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 若 FBeanChild 依赖的 FBean 不存在，则不进行实例化
        /*
            <T> Map<String, T> getBeansOfType(@Nullable Class<T> type)：
                按照类型从 Spring 容器中找到所有给类型的 Bean 对象，返回一个 Map 集合，
                Map 的 key 为 Bean 的名称，value 为 Bean 的实例。
        */
        return context.getBeanFactory().getBeansOfType(FBean.class).size() > 0;
    }
}
