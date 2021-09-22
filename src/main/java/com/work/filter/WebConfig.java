package com.work.filter;

import com.work.interceptor.TimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * 除了在过滤器类上加注解外，我们也可以通过FilterRegistrationBean来注册过滤器。
 *
 * @author peacoke
 * @date 2021/8/22
 */
@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean timeFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //TimeFilter timeFilter = new TimeFilter();
        TimeFilter_2 timeFilter = new TimeFilter_2();
        filterRegistrationBean.setFilter(timeFilter);

        List<String> urlList = new ArrayList<>();
        urlList.add("/*");

        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;
    }

}
