package com.naren17.restapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	

	@GetMapping("/")
	public String welcom() {
		return "Welcome, to Home Page";
	}
	
	@GetMapping("/login")
	public String login() {
		return "Welcome, to Login page";
	}
	
	@PostMapping("/register")
	public String register() {
		return "Welcome, to register page";
	}
	
	@GetMapping("/version")
	public String version() {
		return "Rest_App2_Version_1.2.0";
	}

}
