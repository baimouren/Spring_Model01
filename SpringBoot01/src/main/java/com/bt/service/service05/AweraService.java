package com.bt.service.service05;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

//实现BeanNameAware, ResourceLoaderAware接口，获得Bean名称，资源加载服务
@Service
public class AweraService implements BeanNameAware, ResourceLoaderAware {
    private String BeanName;

    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) {
        this.BeanName = name;
    }

    public void outputResult() {
        System.out.println("Bean 名称为：" + BeanName);
        Resource resource = loader.getResource("classpath:com/bt/el/test.txt");

        try {
            System.out.println("resource读到的内容：" + IOUtils.toString(resource.getInputStream()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
