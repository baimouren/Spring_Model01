package com.bt.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//实现 ApplicationListener 接口，指定监听事件类型 DemoEvent
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    // 处理消息处理
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我（DemoListener）接受到（bean-demoPulisher）发布的消息：" + msg);
    }

}
