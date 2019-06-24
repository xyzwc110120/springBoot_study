package com.cyx.spring_java_config._02_di;

import com.cyx.spring_java_config._02_di.beans.BBean;
import com.cyx.spring_java_config._02_di.beans.BBean_1;
import com.cyx.spring_java_config._02_di.beans.BBean_2;
import com.cyx.spring_java_config._02_di.beans.BBean_3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConfig {

    // 依赖注入，方式一：创建 Bean 的时候创建依赖对象
    @Bean
    public BBean_1 bBean1() {
        BBean_1 bBean1 = new BBean_1();
        bBean1.setBBean(new BBean());
        return bBean1;
    }

    // 依赖注入，方式二：调用依赖的 Bean 的创建方法
    @Bean
    public BBean_2 bBean2() {
        BBean_2 bBean2 = new BBean_2();
        bBean2.setBBean(bBean());
        /* 注意：多次调用创建的 Bean 的方法，返回的是同一实例（单例情况下） */
        System.out.println("bBean()：" + bBean());
        System.out.println("bBean()：" + bBean());
        return bBean2;
    }

    // 依赖注入，方式三：通过参数注入依赖
    @Bean
    public BBean_3 bBean3(BBean bBean) {
        BBean_3 bBean3 = new BBean_3();
        bBean3.setBBean(bBean);
        return bBean3;
    }

    @Bean
    public BBean bBean() {
        return new BBean();
    }

}
