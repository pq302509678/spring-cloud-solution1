package com.wanglibing.uaa.service;

import com.wanglibing.uaa.domain.TbPermission;
import com.wanglibing.uaa.mapper.TbPermissionMapper;
import com.wanglibing.uaa.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: iamwlb
 * @date: 2019-08-21 08:32
 */
@Service
public class TbPermissionService {
    @Resource
    private TbPermissionMapper tbPermissionMapper;

    public List<TbPermission> selectByUserId(Long userId){
        return tbPermissionMapper.selectByUserId(userId);
    }
}
