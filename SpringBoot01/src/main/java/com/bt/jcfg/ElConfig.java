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

    // 注入普通字符串
    @Value("I love you ! ")
    private String normal;

    // 注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    // 注入表达式结果
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private Double randomNumber;

    // 注入其他bean属性
    @Value("#{demoService.another}")
    private String fromAnother;

    // 注入文件资源
    @Value("classpath:com/bt/el/test.txt")
    private Resource testFile;

    // 注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;

    // 注入配置文件
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment enviroment;

    // 注入配置文件
    // 注入配置配件需使用@PropertySource指定文件地址，若使用@value注入，则要配置一个PropertySourcesPlaceholderConfigurer的Bean。注意，@Value("${book.name}")使用的是“$”，而不是“#”。
    // 注入Properties 还可以从Enviroment中获得
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
