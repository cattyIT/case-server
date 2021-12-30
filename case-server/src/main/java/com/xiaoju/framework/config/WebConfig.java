package com.xiaoju.framework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description 处理跨域请求
 * @Author fordeal
 * @Date 2021/12/29下午8:38
 **/

//@Configuration
//@EnableWebMvc
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry corsRegistry) {
//        corsRegistry.addMapping("/**")
//                .allowedOrigins("http://localhost:8094")
//                .allowedMethods("*")
//                .maxAge(3600L)
//                .allowedHeaders("*")
//                .exposedHeaders("Authorization")
//                .allowCredentials(true);
//    }
//}
