package com.naren17.restapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${app.id}")
	String instance;
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/")
	public String hi() {
		return "Port no : " + port+", Welcome, I am "+instance;
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
		return "Rest_App1_Version_1.2.0";
	}
	
	
}
