package com.wanglibing.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: iamwlb
 * @date: 2019-08-16 09:14
 */

/**
 * 注册中心提供服务的服务名称（生产者）
 */
@FeignClient("producer")
public interface HelloService {


    @GetMapping(value="/get")
    /**
     * get方法调用生产者
     */
    public String get(@RequestParam(value="para") String para);

    @PostMapping("/post")
    /**
     * post方法调用生产者
     */
    public String post(@RequestParam(value = "para") String para);
}
