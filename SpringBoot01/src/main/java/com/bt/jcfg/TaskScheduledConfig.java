package com.bt.jcfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.bt.service.service07")
@EnableScheduling // 开启计划任务
public class TaskScheduledConfig {

}
