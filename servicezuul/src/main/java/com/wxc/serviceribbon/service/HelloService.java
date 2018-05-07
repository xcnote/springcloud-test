package com.wxc.serviceribbon.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@HystrixCommand(fallbackMethod = "hiErr")
//	public String hiService(String name) {
//		return this.restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
//	}
//	
//	public String hiErr(String name){
//		return "hi, " + name + ", sorry, error.";
//	}
}
