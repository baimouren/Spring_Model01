package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.PrePostConfig;
import com.bt.service.service04.BeanWayService;
import com.bt.service.service04.JSR250WayService;

public class Main04 {
    public static void main(String[] args) {
        // 2.3 实例化 注解配置应用环境
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();

    }
}
