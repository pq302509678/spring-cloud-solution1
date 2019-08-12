package com.wanglibing.demo1.com.wanglibing.demo1.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: iamwlb
 * @date: 2019-08-12 11:21
 */
@RestController
public class Demo1Controller {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name;
    }
}
