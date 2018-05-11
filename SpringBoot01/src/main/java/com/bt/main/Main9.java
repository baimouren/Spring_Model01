package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.TaskScheduledConfig;

public class Main9 {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(TaskScheduledConfig.class);
    }

}
