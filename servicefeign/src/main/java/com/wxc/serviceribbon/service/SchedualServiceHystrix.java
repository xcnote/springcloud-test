package com.wxc.serviceribbon.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystrix implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "hi, " + name + ", sorry feign.";
	}
}