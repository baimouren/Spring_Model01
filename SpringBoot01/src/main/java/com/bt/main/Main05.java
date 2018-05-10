package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.ProfileConfig;
import com.bt.model.DemoBean;

public class Main05 {

    public static void main(String[] args) {

        /* Profile 为不同环境下使用不同的配置提供了支持(开发环境下的配置和生产环境下的配置肯定是不同的，如：数据库配置)
         * 1.通过设定Enviroment的ActiveProfile来设定当前的context需要使用的配置环境。在开发中使用@Profile注解类或者方法，达到不同的情况下实例化不同Bean
         * 2.通过jvm的spring.profile.active 参数来设置配置环境
         * 3.Web项目设置在Servlet的context parameter中 */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 将活动Profile设置为pro / dev
        context.getEnvironment().setActiveProfiles("dev");
        // 注册Bean配置类，否则会报Bean未注册异常
        context.register(ProfileConfig.class);
        // 刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();

    }

}
