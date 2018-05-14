package com.bt.jcfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bt.test.TestBean;

@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTextBan() {
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTextBan() {
        return new TestBean("from production profile");
    }
}
