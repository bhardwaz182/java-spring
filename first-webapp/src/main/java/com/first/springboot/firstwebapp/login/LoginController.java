package com.first.springboot.firstwebapp.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.first.springboot.firstwebapp.AuthenticationService;


@Controller
public class LoginController {
	
	private AuthenticationService auth;
	
	
	public LoginController(AuthenticationService auth) {
		super();
		this.auth = auth;
	}
	
//	id,username,description,targetDate,done

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginJsp() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcomeJsp(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (auth.isvalid(name, password)) {
			model.put("name",name);
			model.put("password",password);
			return "welcome";
		}
		model.put("error","incorrect cred");
		return "login";
	}
}
