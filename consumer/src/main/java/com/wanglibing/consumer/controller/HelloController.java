package com.wanglibing.consumer.controller;

import com.wanglibing.consumer.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: iamwlb
 * @date: 2019-08-16 09:22
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value="/get")
    /**
     * get方法调用生产者
     */
    public String get(@RequestParam(value="para") String para){
        return helloService.get(para);
    }

    @PostMapping("/post")
    /**
     * post方法调用生产者
     */
    public String post(@RequestParam(value = "para") String para){
        return helloService.post(para);
    }
}
