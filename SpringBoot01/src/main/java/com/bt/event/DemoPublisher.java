package com.bt.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    // 注入ApplicationContext，用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        // publishEvent() 发布事件
        applicationContext.publishEvent(new DemoEvent(this, msg));

    }
}
