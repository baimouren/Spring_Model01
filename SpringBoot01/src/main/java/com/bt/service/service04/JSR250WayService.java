package com.bt.service.service04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    // 构造函数执行后执行
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-mehod");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250Service");
    }

    // Bean销毁之前执行
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-mehod");
    }

}
