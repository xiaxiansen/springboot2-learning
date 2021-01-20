package com.hong.quiz02springaop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.hong.quiz02springaop.mapper")
@SpringBootApplication()
@EnableCaching
public class Quiz02springAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(Quiz02springAopApplication.class, args);
	}

}
