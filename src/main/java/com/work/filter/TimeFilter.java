package com.work.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

/**
 * 过滤器来实现对get方法执行时间计算的功能
 * 配置1：TimeFilter上加注解
 * 配置2：通过FilterRegistrationBean来注册过滤器
 *
 * @author peacoke
 * @date 2021/8/22
 */
@Component
@WebFilter(urlPatterns = {"/*"})
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始执行过滤器");
        long start = new Date().getTime();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("【过滤器】耗时 " + (new Date().getTime() - start));
        System.out.println("结束执行过滤器");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
