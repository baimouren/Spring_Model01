package com.bt.jcfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bt.model.DemoBean;

@Configuration
public class ProfileConfig {

    /* profile为dev时，实例化DemoBean */
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {

        return new DemoBean("from development profile");
    }

    /* profile为prod时，实例化DemoBean */
    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {

        return new DemoBean("from prodduction profile");
    }
}
