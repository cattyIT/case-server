//package com.xiaoju.framework.config;
//
//import lombok.AllArgsConstructor;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description 处理跨域请求
 * @Author fordeal
 * @Date 2021/12/29下午8:37
 **/
//@EnableWebSecurity
//@AllArgsConstructor
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/api/**").permitAll()
//                .antMatchers("/api/user/**").permitAll();
//    }
//}
