package com.cyx.spring_java_config._01_bean.beans;

import org.springframework.beans.factory.FactoryBean;

// 自定义一个工厂方法，实现 FactoryBean 接口
public class ABean_2Factory implements FactoryBean<ABean_2> {

    // 返回生产的 Bean 的对象
    @Override
    public ABean_2 getObject() {
        return new ABean_2();
    }

    // 返回生成的 Bean 的类型
    @Override
    public Class<?> getObjectType() {
        return ABean_2.class;
    }

    // 生产的 Bean 是否为单例，缺省值：false
    @Override
    public boolean isSingleton() {
        return true;
    }
}
