package com.bt.jcfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bt.model.DemoBean;

@Configuration
public class ProfileConfig {

    /* profileΪdevʱ��ʵ����DemoBean */
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {

        return new DemoBean("from development profile");
    }

    /* profileΪprodʱ��ʵ����DemoBean */
    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {

        return new DemoBean("from prodduction profile");
    }
}
