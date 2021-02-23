package com.study;

import com.study.controller.WelcomeController;
import com.study.entity.factory.User;
import com.study.entity.factory.UserFactoryBean;
import com.study.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * @author jianghui
 *
 * stu:spring三大核心 解析配置、定位于注册对象、注入对象
 */
@Configuration
@ComponentScan("com.study")
public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String xmlPath = "E:\\BaiduNetdiskDownload\\spring-framework-5.2.0.RELEASE\\springdemo\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
//		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
//		welcomeService.sayHello("gradle");
		UserFactoryBean userFactoryBean = (UserFactoryBean) applicationContext.getBean("&userFactoryBean");
		User userFactoryBean2 = (User) applicationContext.getBean("userFactoryBean");
		System.out.println("factoryBean创建的对象" + userFactoryBean);
		System.out.println("factoryBean创建的对象" + userFactoryBean2);
	}
	public static void main1(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNames){
			System.out.println(beanName);
		}
		WelcomeController welcomeController = (WelcomeController) applicationContext.getBean("welcomeController");
		welcomeController.handleRequest();
	}
}
