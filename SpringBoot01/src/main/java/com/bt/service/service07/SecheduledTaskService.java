package com.bt.service.service07;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SecheduledTaskService {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(
        fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每5秒执行一次：" + dateFormat.format(new Date()));

    }

    @Scheduled(
        cron = "0 47 9 ? * *")
    public void fixtTimeExecution() {
        System.out.println("指定时间：" + dateFormat.format(new Date()) + "执行");
    }

}
