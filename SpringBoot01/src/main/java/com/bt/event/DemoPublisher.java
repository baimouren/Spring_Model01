package com.bt.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    // ע��ApplicationContext�����������¼�
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        // publishEvent() �����¼�
        applicationContext.publishEvent(new DemoEvent(this, msg));

    }
}
