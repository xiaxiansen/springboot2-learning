package com.hong.quiz02springaop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Quiz02springAopApplicationTests {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	@Test
	void contextLoads() {
	}

}
