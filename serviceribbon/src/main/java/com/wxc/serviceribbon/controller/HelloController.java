package com.wxc.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wxc.serviceribbon.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/hi")
	public String hi(@RequestParam String name){
		return this.helloService.hiService(name) + "[from ribbon]";
	}
}
