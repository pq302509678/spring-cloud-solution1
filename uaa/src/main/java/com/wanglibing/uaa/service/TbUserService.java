package com.wanglibing.uaa.service;

import com.wanglibing.uaa.domain.TbUser;
import com.wanglibing.uaa.mapper.TbUserMapper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author: iamwlb
 * @date: 2019-08-21 08:16
 */
@Service
public class TbUserService {
    @Resource
    private TbUserMapper tbUserMapper;

    public TbUser getByUsername(String username){
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        return tbUserMapper.selectOneByExample(example);
    }
}
