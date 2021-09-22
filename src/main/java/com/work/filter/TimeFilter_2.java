package com.work.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * @author peacoke
 * @date 2021/8/22
 */
public class TimeFilter_2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器TimeFilter_2初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始执行过滤器TimeFilter_2");
        long start = new Date().getTime();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("【过滤器】耗时 " + (new Date().getTime() - start));
        System.out.println("结束执行过滤器TimeFilter_2");
    }
    @Override
    public void destroy() {
        System.out.println("过滤器TimeFilter_2销毁");
    }
}
