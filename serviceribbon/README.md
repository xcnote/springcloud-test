# Spring Cloud 服务消费者（rest+ribbon）与断路器（Hystrix）

在微服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign

## 服务消费者 ribbon

ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。

ribbon 已经默认实现了这些配置bean：

- IClientConfig ribbonClientConfig: DefaultClientConfigImpl

- IRule ribbonRule: ZoneAvoidanceRule

- IPing ribbonPing: NoOpPing

- ServerList ribbonServerList: ConfigurationBasedServerList

- ServerListFilter ribbonServerListFilter: ZonePreferenceServerListFilter

- ILoadBalancer ribbonLoadBalancer: ZoneAwareLoadBalancer

ribbon连接：https://blog.csdn.net/forezp/article/details/69788938

## 断路器 Hystrix

Netflix开源了Hystrix组件，实现了断路器模式，SpringCloud对这一组件进行了整合.

较底层的服务如果出现故障，会导致连锁故障。当对特定的服务的调用的不可用达到一个阀值（Hystric 是5秒20次） 断路器将会被打开。

断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值。

首先在pox.xml文件中加入spring-cloud-starter-hystrix的起步依赖，在程序的启动类ServiceRibbonApplication 加@EnableHystrix注解开启Hystrix

- Hystrix Dashboard (断路器：Hystrix 仪表盘)

首选在pom.xml引入spring-cloud-starter-hystrix-dashboard的起步依赖
在主程序启动类中加入@EnableHystrixDashboard注解，开启hystrixDashboard

断路器连接：https://blog.csdn.net/forezp/article/details/69934399