package com.bt.service.service02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // 每次调用新建一个Bean实例
public class DemoPrototypeService {

}
