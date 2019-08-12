![springcloud.png](images/springcloud.png)
# spring-cloud-solution1 介绍
spring-cloud-solution1 是一个基于Spring Cloud的 基础框架示例。
## 技术版本介绍

| 项 | 版本 |  
| :---- |:----| 
| JDK | 1.8 | 
| SpringBoot | 2.1.7.RELEASE | 
| SpringCloud | Greenwich.RELEASE | 
| Nacos | 1.1.3 | 
| Skywalking | - | 
| Swagger | - | 

## 技术栈

| 技术栈 | 说明 |  
| :---- |:----| 
| Kong | 服务网关，用于服务智能路由，负载均衡 | 
| Nacos | 1. 服务注册和发现<br>2. 服务配置中心 | 
| Feign | 声明式服务调用，用于消费服务 | 
| Hystrix | 熔断器 | 
| Skywalking | 链路监控 | 
| Hystrix Dashboard | 熔断器仪表板，用于监控熔断器的状况 | 
| Turbine | 聚合多个Hystrix Dashboard | 
| Spring Boot Admin | 聚合监控微服务的状况 | 
| Swagger | API接口文档组件 |  

## 系统介绍
| 子系统 | 端口 | 演示地址 | 说明 | 
| :----: |:----|:----| :----| 
| producer | 8081 | - [http://192.168.0.201:8848/nacos/](http://192.168.0.201:8848/nacos/)<br>- [http://localhost:8081](http://localhost:8081) | 生产者 | 
| consumer | 8082 | - [http://192.168.0.201:8848/nacos/](http://192.168.0.201:8848/nacos/)<br>- [http://localhost:8082](http://localhost:8082) | 消费者 | 
| demo1 | 8091 | - [http://192.168.0.201:8848/nacos/](http://192.168.0.201:8848/nacos/)<br>- [http://localhost:8091/hello?name=wanglibing](http://localhost:8091/hello?name=wanglibing) | Spring Cloud集成Nanos服务注册和发现 | 
| demo2 | 8092 | - [http://192.168.0.201:8848/nacos/](http://192.168.0.201:8848/nacos/)<br>- [http://localhost:8092](http://localhost:8092) | Spring Cloud集成Nanos分布式配置管理服务 | 
| demo3 | 8093 | - [http://localhost:8093](http://localhost:8093)<br>- []() | Spring Cloud集成Skywalking链路监控服务 | 
| demo4 | 8094 | - [http://localhost:8094](http://localhost:8094) | Spring Cloud整合gRPC | 
| demo5 | 8095 | - [http://localhost:8095](http://localhost:8095) | Spring Cloud整合ELK | 

# 部署

## 安装Nacos

- 参考 [Nacos基础](https://www.wanglibing.com/2019/08/11/Nacos基础/)

## 安装Skywalking

- 参考 [SkyWalking基础](https://www.wanglibing.com/2018/12/22/SkyWalking基础/)

## 安装ELK

- 参考 [ELK基础](https://www.wanglibing.com/2018/08/05/ELK基础/)
- 参考 [ELK部署](https://www.wanglibing.com/2019/06/26/ELK部署/)


