package com.naren17.netflixfeignapicall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naren17.netflixfeignapicall.client.RestClient;

@RestController
public class HomeController {

	@Autowired
	RestClient restClient;
	
	@GetMapping("/rest-version")
	public String welcome() {
		return restClient.getVersion();
	}
	
}
