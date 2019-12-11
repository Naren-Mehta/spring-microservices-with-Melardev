package com.naren17.netflixribbonloadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.naren17.netflixribbonloadbalancer.config.RibbonConfiguration;

@SpringBootApplication(scanBasePackages = "com.naren17.netflixribbonloadbalancer.controller")
@EnableDiscoveryClient
@RibbonClient(name = "ribbon-load-balancer", configuration = RibbonConfiguration.class)
public class NetflixRibbonLoadBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixRibbonLoadBalancerApplication.class, args);
	}

}
