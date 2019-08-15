package com.wanglibing.producer.controller;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: iamwlb
 * @date: 2019-08-15 22:21
 */
@RestController
public class HelloController {

    @GetMapping("/get")
    @ResponseBody
    public String get(HttpServletResponse response, @RequestParam(value = "para") String para) {
        return para + "_get_service";
    }
    @PostMapping("/post")
    @ResponseBody
    public String post(HttpServletResponse response, @RequestParam(value = "para") String para) {
        return para + "_post_service";
    }
}
