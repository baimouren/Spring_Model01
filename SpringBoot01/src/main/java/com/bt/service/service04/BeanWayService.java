package com.bt.service.service04;

public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("��ʼ�����캯��-BeanWayService");
    }
    
    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
