package com.bt.service.service08;

import org.springframework.stereotype.Service;

@Service
public class DemoService2 {
    public void outputResult() {
        System.out.println("从组合注解配置照样获得Bean");
    }
}
