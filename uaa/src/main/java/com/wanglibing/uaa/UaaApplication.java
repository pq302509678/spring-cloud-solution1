package com.wanglibing.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

/**
 * 配置服务发现
 */
//@EnableDiscoveryClient
public class UaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaaApplication.class, args);
    }

}
