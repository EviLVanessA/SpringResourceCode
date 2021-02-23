package com.study.controller;

import com.study.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author jianghui
 * @date 2021-02-22 15:27
 */
@Controller
public class WelcomeController {
	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest(){
		welcomeService.sayHello("来自Controller");
	}
}
