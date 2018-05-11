package com.bt.jcfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.bt.condition.LinuxCondition;
import com.bt.condition.LinuxListService;
import com.bt.condition.ListService;
import com.bt.condition.WindowsCondition;
import com.bt.condition.WindowsListService;

@Configuration
public class ConditionConfig {

    /* @Conditional 根据特定条件创建特定的Bean */
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }

}
