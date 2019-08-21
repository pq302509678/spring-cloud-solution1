package com.wanglibing.uaa.config;

import com.google.common.collect.Lists;
import com.wanglibing.uaa.domain.TbPermission;
import com.wanglibing.uaa.domain.TbUser;
import com.wanglibing.uaa.service.TbPermissionService;
import com.wanglibing.uaa.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author: iamwlb
 * @date: 2019-08-21 08:27
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if(tbUser!=null){
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                 grantedAuthorities.add(grantedAuthority);
            });
        }

        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
    }
}
