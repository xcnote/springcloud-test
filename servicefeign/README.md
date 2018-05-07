# Spring Cloud 服务消费者（Feign）与断路器（Hystrix）

## 服务消费者 Feign

Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。

简而言之：

- Feign 采用的是基于接口的注解
- Feign 整合了ribbon

feign连接：https://blog.csdn.net/forezp/article/details/69808079

## 断路器 Hystrix

Feign是自带断路器的，在D版本的Spring Cloud中，它没有默认打开。需要在配置文件中配置打开它

- Hystrix Dashboard (断路器：Hystrix 仪表盘)

首选在pom.xml引入spring-cloud-starter-hystrix-dashboard的起步依赖
在主程序启动类中加入@EnableHystrixDashboard注解，开启hystrixDashboard

断路器连接：https://blog.csdn.net/forezp/article/details/69934399