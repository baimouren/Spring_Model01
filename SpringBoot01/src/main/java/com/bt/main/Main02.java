package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.DiConFig;
import com.bt.service.service02.DemoPrototypeService;
import com.bt.service.service02.DemoSingletonService;

public class Main02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConFig.class);
        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("Singleton是否相等：" + singletonService1.equals(singletonService2));
        System.out.println("Prototype是否相等：" + demoPrototypeService1.equals(demoPrototypeService2));

        String string1 = "1";
        String string2 = "1";
        System.out.println("Prototype是否相等：" + string1.equals(string2));

        context.close();
    }
}
