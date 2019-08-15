package com.wanglibing.demo7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: iamwlb
 * @date: 2019-08-15 08:11
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "演示：使用fabric8io构建Docker镜像！";
    }
}
