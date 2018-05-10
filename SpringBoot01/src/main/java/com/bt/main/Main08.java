package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.TaskExecutorConfig;
import com.bt.service.service06.AsynicTaskService;

public class Main08 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsynicTaskService asynicTaskService = context.getBean(AsynicTaskService.class);

        for (int i = 0; i < 10; i++) {
            asynicTaskService.executeAsyncTask(i);
            asynicTaskService.executeAsyncTaskPlus(i);
        }

        context.close();

    }
}
