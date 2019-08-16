package com.wanglibing.demo9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
/**
 * 配置服务发现
 */
@EnableDiscoveryClient
public class Demo9Application {

    /**
     * 开启负载均衡客户端
     */
    @LoadBalanced
    /**
     * 注册一个具有容错功能的RestTemplate
     * @return
     */
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo9Application.class, args);
    }

}
