package com.naren17.netflixfeignapicall.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rest-app")
public interface RestClient {
	
	@RequestMapping("/version")
	String getVersion();

}
