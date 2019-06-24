package com.cyx.spring.springboot._07_servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter
public class TestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Test Filter!");
        // 放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
