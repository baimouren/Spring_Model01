package com.bt.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//ʵ�� ApplicationListener �ӿڣ�ָ�������¼����� DemoEvent
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    // ������Ϣ����
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("�ң�DemoListener�����ܵ���bean-demoPulisher����������Ϣ��" + msg);
    }

}
