package com.wxc.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 * 服务注册中心页面：http://localhost:8761/，遵循application.yml配置
 * 服务消费者，使用feign
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //消费者+断路器
@EnableHystrixDashboard //断路器控制台
@EnableCircuitBreaker  //启动断路器
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
