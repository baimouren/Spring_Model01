package com.bt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bt.jcfg.ProfileConfig;
import com.bt.model.DemoBean;

public class Main05 {

    public static void main(String[] args) {

        /* Profile Ϊ��ͬ������ʹ�ò�ͬ�������ṩ��֧��(���������µ����ú����������µ����ÿ϶��ǲ�ͬ�ģ��磺���ݿ�����)
         * 1.ͨ���趨Enviroment��ActiveProfile���趨��ǰ��context��Ҫʹ�õ����û������ڿ�����ʹ��@Profileע������߷������ﵽ��ͬ�������ʵ������ͬBean
         * 2.ͨ��jvm��spring.profile.active �������������û���
         * 3.Web��Ŀ������Servlet��context parameter�� */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // ���Profile����Ϊpro / dev
        context.getEnvironment().setActiveProfiles("dev");
        // ע��Bean�����࣬����ᱨBeanδע���쳣
        context.register(ProfileConfig.class);
        // ˢ������
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();

    }

}
