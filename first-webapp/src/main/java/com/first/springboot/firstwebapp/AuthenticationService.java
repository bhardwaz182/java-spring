package com.first.springboot.firstwebapp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public Boolean isvalid(String name, String password) {
		if (name.equals("name") && password.equals("name")) {
			return true;
		}
		return false;
	}
}
