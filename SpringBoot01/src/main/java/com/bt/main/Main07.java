package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.AweraConfig;
import com.bt.service.service05.AweraService;

public class Main07 {
    /* 3.1.1 spring awera
     * awera 的目的是为了使Bean获得Spring容器的服务，
     * 因为ApplicationContext接口集成了MessageSource接口，
     * ApplicationEventPublisher接口，和ResourceLoader接口；
     * 所以Bean继承ApplicationContext可以获得Spring容器的所有服务，
     * 但原则上我们用到什么接口，就实现什么接口 */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AweraConfig.class);
        AweraService aweraService = context.getBean(AweraService.class);
        aweraService.outputResult();

        context.close();
    }

}
