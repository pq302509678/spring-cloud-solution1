package com.wanglibing.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
/**
 * 配置服务发现
 */
@EnableDiscoveryClient
public class Demo1Application {


    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
