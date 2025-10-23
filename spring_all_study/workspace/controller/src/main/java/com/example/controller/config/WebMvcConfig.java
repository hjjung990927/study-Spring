package com.example.controller.config;

import com.example.controller.interceptor.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 시작하자마자 읽는 어노테이션, 설정 파일에 붙인다
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/test/**");
//        .excludePathPatterns("/test/**"): /test 경로를 제외한 모든 파일
        
        
    }
}
