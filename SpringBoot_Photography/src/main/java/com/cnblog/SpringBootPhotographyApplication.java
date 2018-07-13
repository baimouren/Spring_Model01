package com.cnblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cnblog.mapper")
@SpringBootApplication
public class SpringBootPhotographyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPhotographyApplication.class, args);
	}
}
