package com.bt.jcfg;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.bt")
@PropertySource("classpath:com/bt/el/test.properties")
public class ElConfig {

    // ע����ͨ�ַ���
    @Value("I love you ! ")
    private String normal;

    // ע�����ϵͳ����
    @Value("#{systemProperties['os.name']}")
    private String osName;

    // ע����ʽ���
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private Double randomNumber;

    // ע������bean����
    @Value("#{demoService.another}")
    private String fromAnother;

    // ע���ļ���Դ
    @Value("classpath:com/bt/el/test.txt")
    private Resource testFile;

    // ע����ַ��Դ
    @Value("http://www.baidu.com")
    private Resource testUrl;

    // ע�������ļ�
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment enviroment;

    // ע�������ļ�
    // ע�����������ʹ��@PropertySourceָ���ļ���ַ����ʹ��@valueע�룬��Ҫ����һ��PropertySourcesPlaceholderConfigurer��Bean��ע�⣬@Value("${book.name}")ʹ�õ��ǡ�$���������ǡ�#����
    // ע��Properties �����Դ�Enviroment�л��
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {

        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(enviroment.getProperty("book.author"));

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
