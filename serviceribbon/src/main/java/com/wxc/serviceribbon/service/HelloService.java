package com.wxc.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "hiErr")
	public String hiService(String name) {
		return this.restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
	}
	
	public String hiErr(String name){
		return "hi, " + name + ", sorry, error.";
	}
}
