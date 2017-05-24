package com.wondersgroup.mydemo.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wangshuo on 2017/5/24.
 */
@Configuration
public class MyWebAppConfigurer  extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MaxSizeInterceptor maxSizeInterceptor=new MaxSizeInterceptor();
        maxSizeInterceptor.setMaxSize(102400000);//10kb
        registry.addInterceptor(maxSizeInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
