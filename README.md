![springcloud.png](images/springcloud.png)
# spring-cloud-solution1 介绍
spring-cloud-solution1 是一个基于Spring Cloud的 基础框架示例。

# 技术栈

| 技术栈 | 说明 |  
| :---- |:----| 
| JDK | 1.8 |  | 
| SpringBoot | 2.1.7.RELEASE |  | 
| SpringCloud | Greenwich.RELEASE |  | 
| Kong | 1.2 | 服务网关，用于服务智能路由，负载均衡 | 
| Nacos | 1.1.3 | 1. 服务注册和发现<br>2. 服务配置中心 | 
| Feign | - | 声明式服务调用，用于消费服务 | 
| Skywalking | 6.3.0 | 链路监控 | 
| Sentinel | 1.6.3 | 熔断、限流 | 
| Spring Boot Admin | - | 聚合监控微服务的状况 | 
| Swagger | - | API接口文档组件 |  

# 系统介绍
| 子系统 | 端口 | 说明 | 
| :----: |:----|:----| 
| producer | 8081 | 生产者 | 
| consumer | 8082 | 消费者 | 
| demo1 | 8091 | Spring Cloud集成Nanos服务注册和发现 | 
| demo2 | 8092 | Spring Cloud集成Nanos分布式配置管理服务 | 
| demo3 | 8093 | Spring Cloud集成Skywalking链路监控服务 | 
| demo4 | 8094 | Spring Cloud整合gRPC | 
| demo5 | 8095 | Spring Cloud整合ELK | 
| demo6 | 8096 | Spring Cloud整合Sentinel | 

# 部署

## 环境说明
| 中间件 | 地址 | 说明 | 
| :----: |:----|:----| 
| Nacos | http://192.168.0.201:8848/nacos | 用户名：admin<br>密码：admin | 
| SkyWalking |  | - | 
|  |  | - | 
|  |  | - | 
|  |  | - | 
|  |  | - | 

## 安装Nacos

<a name="安装Nacos"/>

- 参考 [Nacos基础](https://www.wanglibing.com/2019/08/11/Nacos基础/)

## 安装Skywalking

<a name="安装Skywalking"/>

- 参考 [SkyWalking基础](https://www.wanglibing.com/2018/12/22/SkyWalking基础/)

## 安装ELK

<a name="安装ELK"/>

- 参考 [ELK基础](https://www.wanglibing.com/2018/08/05/ELK基础/)
- 参考 [ELK部署](https://www.wanglibing.com/2019/06/26/ELK部署/)

# 安装Sentinel

<a name="安装Sentinel"/>

- 参考[Sentinel基础](https://www.wanglibing.com/2018/12/24/Sentinel基础/)


# 演示

## producer

- [http://192.168.0.201:8848/nacos/](http://192.168.0.201:8848/nacos/)
- [http://localhost:8081](http://localhost:8081)

## consumer

- [http://192.168.0.201:8848/nacos/](http://192.168.0.201:8848/nacos/)
- [http://localhost:8082](http://localhost:8082)

## demo1

### 部署Nacos
参考 [安装Nacos](#安装Nacos)

### 演示服务注册
 
- [http://localhost:8091/hello?name=wanglibing](http://localhost:8091/hello?name=wanglibing) 

【Nacos】--> 【服务管理】--> 【服务列表】，观察。

## demo2

### 部署Nacos
参考 [安装Nacos](#安装Nacos)

### 演示

1. 初始化数据
```
$ curl -X POST "http://192.168.0.201:8848/nacos/v1/cs/configs?dataId=com.wanglibing.demo2.yaml&group=DEFAULT_GROUP&content=useLocalCache=false"
```
2. 打开[http://localhost:8092/config/get](http://localhost:8092/config/get)，观察useLocalCache的值。
3. 修改数据
```
$ curl -X POST "http://192.168.0.201:8848/nacos/v1/cs/configs?dataId=com.wanglibing.demo2.yaml&group=DEFAULT_GROUP&content=useLocalCache=true"
```
4. 刷新[http://localhost:8092/config/get](http://localhost:8092/config/get)，观察useLocalCache的值。


## demo3

- []()
- [http://localhost:8093](http://localhost:8093)

## demo4

- [http://localhost:8094](http://localhost:8094)

## demo5

- [http://localhost:8095](http://localhost:8095)

## demo6

- [http://localhost:8096](http://localhost:8096)