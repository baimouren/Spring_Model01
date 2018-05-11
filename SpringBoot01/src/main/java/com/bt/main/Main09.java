package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.condition.ListService;
import com.bt.jcfg.ConditionConfig;

public class Main09 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + " 系统下的命令为：" + listService.showListCmd());
    }

}
