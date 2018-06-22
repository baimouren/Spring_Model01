package com.cnblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello() {
        // java12345
        return "spring boot 入门 ";
    }
}
