package com.first.springboot.firstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/login")
	public String loginJsp(@RequestParam String name, ModelMap model) {
		logger.debug("Request param is {}",name);
//		System.out.println(name);
		model.put("name", name);
		return "login";
	}
}
