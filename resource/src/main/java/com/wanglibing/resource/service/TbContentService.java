package com.wanglibing.resource.service;

import com.wanglibing.resource.domain.TbContent;
import com.wanglibing.resource.mapper.TbContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: iamwlb
 * @date: 2019-08-21 22:29
 */
@Service
public class TbContentService {

    @Resource
    TbContentMapper tbContentMapper;

    public List<TbContent> selectAll(){
        return tbContentMapper.selectAll();
    }
}
