package com.wxc.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wxc.serviceribbon.service.SchedualServiceHi;

@RestController
public class HelloController {

	@Autowired
	private SchedualServiceHi serviceHi;
	
	@RequestMapping(method = RequestMethod.GET, value = "/hi")
	public String hi(@RequestParam String name){
		return this.serviceHi.sayHiFromClientOne(name) + "[from feign]";
	}
}
