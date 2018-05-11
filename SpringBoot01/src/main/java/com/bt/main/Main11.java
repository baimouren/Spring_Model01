package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.AnotaionConfig;
import com.bt.service.service08.DemoService2;

public class Main11 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnotaionConfig.class);
        DemoService2 demoService = context.getBean(DemoService2.class);

        demoService.outputResult();
        context.close();

    }
}
