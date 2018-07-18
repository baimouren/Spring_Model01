package com.cnblog.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 映射Locations所指定的文件夹资源，到Handler指定的这个访问路径
         */
        // registry.addResourceHandler("/webFilePath/**").addResourceLocations("file:/C:/Users/程彬/Pictures/头像/");
        registry.addResourceHandler("/webFile/**").addResourceLocations("file:/Z:\\学习成长篇/");
    }
}
