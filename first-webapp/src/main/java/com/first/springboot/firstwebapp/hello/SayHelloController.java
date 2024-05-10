package com.first.springboot.firstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("hello-world")
	@ResponseBody
	public String SayHello() {
		return "Hello World!";
	}
	
	@RequestMapping("hello-world-html")
	@ResponseBody
	public String SayHelloHtml() {
		return "<html><title>Html page</title><body><h1>Hello world! HTML page</h1></body></html>";
	}
	
	@RequestMapping("hello-world-jsp")
	public String SayHelloJsp() {
		return "sayHello";
	}
}
