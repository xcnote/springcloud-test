# Spring Cloud 服务注册中心（Eureka Client）

Spring Cloud Netflix的Eureka ,eureka是一个服务注册和发现模块

当client向server注册时，它会提供一些元数据，例如主机和端口，URL，主页等。Eureka server 从每个client实例接收心跳消息。 如果心跳超时，则通常将该实例从注册server中删除。

通过注解@EnableEurekaClient 表明自己是一个eurekaclient

仅仅@EnableEurekaClient是不够的，还需要在配置文件中注明自己的服务注册中心的地址

需要指明spring.application.name,这个很重要，这在以后的服务与服务之间相互调用一般都是根据这个name

连接：https://blog.csdn.net/forezp/article/details/69696915