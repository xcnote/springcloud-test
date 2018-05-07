# Spring Cloud 路由网关（Zuul）

Zuul的主要功能是路由转发和过滤器。 路由功能是微服务的一部分，比如／api/user转发到到user服务，/api/shop转发到到shop服务。zuul默认和Ribbon结合实现了负载均衡的功能。

Zuul不仅只是路由，并且还能过滤，做一些安全验证

连接：https://blog.csdn.net/forezp/article/details/69939114