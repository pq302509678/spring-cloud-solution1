package com.wanglibing.demo8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: iamwlb
 * @date: 2019-08-15 08:59
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "演示：使用spotify构建Docker镜像！";
    }
}
