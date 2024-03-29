![springcloud.png](images/springcloud.png)
# spring-cloud-solution1 介绍
spring-cloud-solution1 是一个基于Spring Cloud的 基础框架示例。

# 技术栈

| 技术栈 | 版本 | 说明 |  
| :---- |:----| :----| 
| JDK | 1.8 |  | 
| SpringBoot | 2.1.7.RELEASE |  | 
| SpringCloud | Greenwich.RELEASE |  | 
| Kong | 1.2 | **服务网关**。主要功能：<br>- 请求接入<br>- 请求路径校验<br>- 路由 | 
| Nacos | 1.1.3 | - 服务注册和发现<br>- 服务配置中心 | 
| Feign | - | 声明式服务调用，用于消费服务 | 
| Skywalking | 6.3.0 | 链路监控 | 
| Sentinel | 1.6.3 | 熔断、限流 | 
| Spring Boot Admin | - | 聚合监控微服务的状况 | 
| Spring Security OAuth2.0 |  | Spring Security与OAuth2.0集成 | 
| HikariCP | 3.3.1 | 连接池 | 
| MyBatis |  | 访问数据库 | 
| MyBatis-Generator |  | 自动化代码生成插件 | 
| Mybatis PageHelper |  | 物理分页插件 | 
| [tk-mybatis](http://mybatis.tk) |  | 通用Mapper | 
| [log4j2]() |  | 记录日志 | 
| devtools |  | 热部署 | 
| lombok |  | 简化代码 | 
| Swagger | - | API接口文档组件 |  


# 系统介绍
| 子系统 | 端口 | 说明 | 特性 | 
| :----: |:----|:----|:----| 
| user | 8085 | 用户中心 |  | 
| uaa | 8083 | 认证、授权中心 |  | 
| log | 8086 | 日志中心 |  | 
| kong | 80 | (功能开发未完成)<br>**服务网关**。主要功能：<br>- 请求接入<br>- 请求路径校验<br>- 路由 |  | 
| producer | 8081 | **生产者** | - 集成Nanos服务注册和发现<br>- 集成Nanos分布式配置管理服务<br>- 集成Skywalking链路监控服务<br>- 整合gRPC<br>- 整合Sentinel | 
| consumer | 8082 | **消费者**<br>- 使用Feign调用生产者 | - 集成Nanos服务注册和发现<br>- 集成Nanos分布式配置管理服务<br>- 集成Skywalking链路监控服务<br>- 整合Sentinel |  
| resource | 8084 | 资源服务<br>演示：与uaa集成 | - 集成Mybatis<br>- 集成MyBatis-Generator<br>- 集成Mybatis PageHelper<br>- 集成tk-mybatis | 
| demo1 | 8091 | 演示：Spring Cloud集成Nanos服务注册和发现 |  | 
| demo2 | 8092 | 演示：Spring Cloud集成Nanos分布式配置管理服务 |  | 
| demo3 | 8093 | 演示：Spring Cloud集成Skywalking链路监控服务 |  | 
| demo4 | 8094 | 演示：Spring Cloud整合gRPC<br>(功能开发未完成) |  | 
| demo5 | 8095 | 演示：Spring Cloud整合ELK<br>(功能开发未完成) |  | 
| demo6 | 8096 | 演示：Spring Cloud整合Sentinel<br>(功能开发未完成) |  | 
| demo7 | 8097 | 演示：使用fabric8io构建Docker镜像 |  | 
| demo8 | 8098 | 演示：使用spotify构建Docker镜像 |  | 
| demo9 | 8099 | 演示：Ribbon调用生产者（不推荐） |  | 
| demo10 | 8100 | 演示：整合log4j2 | - 集成log4j2<br>- 异步支持<br>- jsonLayout<br>- 使用lombok简化代码 | 


# 部署

## 环境说明
| 中间件 | 地址 | 说明 | 
| :----: |:----|:----| 
| Nacos | 192.168.0.201 | URL：[http://192.168.0.201:8848/nacos](http://192.168.0.201:8848/nacos)<br>用户名：admin<br>密码：admin | 
| Elasticsearch | 192.168.0.202 | 用于Skywalking数据存储 | 
| Skywalking | 192.168.0.203 | URL：[http://192.168.0.203:8080](http://192.168.0.203:8080)<br>用户名：admin<br>密码：admin | 
| Harbor | 192.168.0.204 | URL：[http://192.168.0.204](http://192.168.0.204)<br>用户名：admin<br>密码：Harbor12345 | 

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

## consumer演示

- [http://localhost:8082/get?para=kevin](http://localhost:8082/get?para=kevin)
- [http://localhost:8082/post?para=kevin](http://localhost:8082/post?para=kevin)

## uaa演示

1. 打开 [http://localhost:8083/oauth/authorize?client_id=client&response_type=code](http://localhost:8083/oauth/authorize?client_id=client&response_type=code)，授权后会跳转到https://www.wanglibing.com/?code=BYVXO3，授权码即为code。
用户名：admin
密码：123456
2. 用上一步得到的code进行如下post请求，获取access_token
```
$ curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'grant_type=authorization_code&code=BYVXO3' "http://client:secret@localhost:8083/oauth/token"
# 返回access_token
{"access_token":"c00f90de-8dd3-4429-99b9-36dba6a4ed51","token_type":"bearer","expires_in":43199,"scope":"app"}%
   ```
 
## resource演示

1. 先获取access_token
2. http://localhost:8084/?access_token=fb9177d5-1dcb-45da-ab30-d8e5c6b19ebe

## demo1演示

1. 打开[http://localhost:8091/hello?name=wanglibing](http://localhost:8091/hello?name=wanglibing) 
2. 【Nacos】--> 【服务管理】--> 【服务列表】，观察。

## demo2演示


1. 初始化数据
```
$ curl -X POST "http://192.168.0.201:8848/nacos/v1/cs/configs?dataId=com.wanglibing.demo2.yaml&group=DEFAULT_GROUP&type=yaml&content=useLocalCache=false"
```
2. 打开[http://localhost:8092/config/get](http://localhost:8092/config/get)，观察useLocalCache的值。
3. 在Nacos中，将com.wanglibing.demo2.yaml修改为：
```
useLocalCache: true
```
4. 刷新[http://localhost:8092/config/get](http://localhost:8092/config/get)，观察useLocalCache的值。


## demo3演示

- []()
- [http://localhost:8093](http://localhost:8093)

## demo4演示

- [http://localhost:8094](http://localhost:8094)

## demo5演示

- [http://localhost:8095](http://localhost:8095)

## demo6演示

- [http://localhost:8096](http://localhost:8096)

## demo7演示

- [http://localhost:8097](http://localhost:8097)

## demo8演示
```
# 切换目录
$ cd demo8

# 构建镜像
$ mvn clean package docker:build

# 查看镜像
$ docker images | grep demo8

# 启动镜像
$ docker run -p 8098:8098 demo8

# 访问
$ curl http://localhost:8098
```

## demo9演示

- [http://localhost:8099/ribbon/get](http://localhost:8082/ribbon/get)
- [http://localhost:8099/ribbon/post](http://localhost:8082/ribbon/post)

## demo10演示
【运行】Demo10Application

