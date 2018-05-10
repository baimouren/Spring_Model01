package com.bt.jcfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bt.service.service04.BeanWayService;
import com.bt.service.service04.JSR250WayService;

@Configuration
@ComponentScan("com.bt")
public class PrePostConfig {

    @Bean(
        initMethod = "init", // ���캯����ִ��
        destroyMethod = "destroy") // ���ٺ�ִ��
    BeanWayService beaWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }

}
