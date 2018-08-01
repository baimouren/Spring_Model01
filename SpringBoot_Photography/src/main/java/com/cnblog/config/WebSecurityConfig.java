package com.cnblog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

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
        .anyRequest().authenticated() //4
        .and()
        .formLogin()
            .loginPage("/login.html")
            .failureUrl("/login.html?error")
            .permitAll() //5
        .and()
        .logout().permitAll() ;
        super.configure(http);
    }
}
