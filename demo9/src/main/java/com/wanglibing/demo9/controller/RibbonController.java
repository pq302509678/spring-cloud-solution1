package com.wanglibing.demo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author: iamwlb
 * @date: 2019-08-16 08:53
 */
@RestController
public class RibbonController {
    private final RestTemplate restTemplate;

    @Autowired
    public RibbonController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "ribbon/get")
    public String ribbonGet() {
        return restTemplate.getForEntity("http://producer/get?para={0}", String.class, "client_ribbon").getBody();
    }

    @PostMapping(value = "ribbon/post")
    public String ribbonPost() {
        HttpHeaders headers = new HttpHeaders();
        MultiValueMap<String, Object> parammap = new LinkedMultiValueMap<>();
        parammap.add("para", "ribbon_client");
        HttpEntity<Map> entity = new HttpEntity<>(parammap, headers);
        return restTemplate.postForEntity("http://producer/post", entity, String.class).getBody();
    }
}
