package com.cyx.springMVC_java_config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import java.util.EnumSet;

/*
    AbstractAnnotationConfigDispatcherServletInitializer 是 WebApplicationInitializer 接口的抽象实现类，
    继承该类使得配置 DispatcherServlet（前端控制器）变得更容易
*/
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // 配置 MVC 容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    // 映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void registerContextLoaderListener(ServletContext servletContext) {
        // 注册 Servlet 上下文对象
        super.registerContextLoaderListener(servletContext);

        // 编码过滤器
        FilterRegistration.Dynamic dynamic = servletContext.addFilter("characterEncodingFilter", CharacterEncodingFilter.class);
        dynamic.setInitParameter("encoding", "UTF-8");
        dynamic.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    }
}
