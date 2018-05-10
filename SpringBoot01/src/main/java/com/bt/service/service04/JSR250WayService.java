package com.bt.service.service04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    // ���캯��ִ�����ִ��
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-mehod");
    }

    public JSR250WayService() {
        super();
        System.out.println("��ʼ�����캯��-JSR250Service");
    }

    // Bean����֮ǰִ��
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-mehod");
    }

}
