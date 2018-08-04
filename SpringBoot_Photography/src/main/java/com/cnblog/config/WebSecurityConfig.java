package com.cnblog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        // TODO Auto-generated method stub
        super.configure(web);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO Auto-generated method stub
        super.configure(auth);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        //允许加载js,css,静态资源：  https://blog.csdn.net/wanderlustLee/article/details/80021468
        .antMatchers("/js/**","/css/**","/images/*","/fonts/**","/**/*.png","/**/*.jpg").permitAll()
        .anyRequest().authenticated() //所有请求需要登录后才能访问
        .and()
        .formLogin()
                .loginPage("/login.html") // 未登陆的情况下，默认跳转的页面
                .failureUrl("/login.html?error") // 如果登陆失败，跳转的url
            .permitAll() // 定制登录行为，登录页面可以任意访问
        .and()
        .logout().permitAll() ;//定制注销行为，注销请求可以任意访问
        super.configure(http);
    }
}
