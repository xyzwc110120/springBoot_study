package com.cyx.spring.springboot;

import com.cyx.spring.springboot._09_interceptor.MyInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
// 使用 @MapperScan 注解扫描 mapper 接口
@MapperScan("com.cyx.spring.springboot.mapper")
// 使用 @EnableTransactionManagement 注解开启事务注解驱动支持
@EnableTransactionManagement
// 自动扫描添加了 @WebServlet、@WebFilter 和 @WebListener 类
@ServletComponentScan
public class Application implements WebMvcConfigurer {

    // 注入自定义拦截器
    private final MyInterceptor myInterceptor;

    public Application(MyInterceptor myInterceptor) {
        this.myInterceptor = myInterceptor;
    }

    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/springboot/interceptor");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}