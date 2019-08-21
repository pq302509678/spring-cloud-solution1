package com.wanglibing.resource.controller;

import com.wanglibing.resource.base.ResponseResult;
import com.wanglibing.resource.domain.TbContent;
import com.wanglibing.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: iamwlb
 * @date: 2019-08-21 22:27
 */
@RestController
public class TbContentController {
    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> list(){
        return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.toString(), tbContentService.selectAll());
    }
}
