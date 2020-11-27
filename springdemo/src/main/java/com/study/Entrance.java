package com.study;

import com.study.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author jianghui
 *
 * stu:spring三大核心 解析配置、定位于注册对象、注入对象
 */
@Configuration
@ComponentScan("com.study")
public class Entrance {
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//
//		String xmlPath = "E:\\BaiduNetdiskDownload\\spring-framework-5.2.0.RELEASE\\springdemo\\src\\main\\resources\\spring\\spring-config.xml";
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
//		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
//		welcomeService.sayHello("gradle");
//	}
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNames){
			System.out.println(beanName);
		}
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeServiceImpl");
		welcomeService.sayHello("gradle");
	}
}
