# speculation-destroys-life
1. 框架：SpringCloud Greenwich.SR2 + SpringBoot 2.1.7.RELEASE
2. 版本控制：Jdk1.8 + Maven
3. 服务治理：Eureka
4. 路由和过滤：Zuul
5. 安全控制：oauth2
6. 链路监控：Zipkin
7. 服务调用：Feign
8. 客户端负载均衡：Ribbon
9. 熔断流量控制：Hystrix
10. 数据库 mysql 8.0 + redis

## 一、注册中心和网关服务
1. 注册中心:9001
2. 网关服务:9060

## 二、用户服务
1. 用户服务:9040

## 三、RabbitMQ服务
1. RabbitMQ测试服务9050

## 四、其他服务(当前都是测试服务)
1. service-provider 9020 
2. service-client 9030