package com.tbsoo.xtpay.service.impl;

import com.tbsoo.xtpay.dao.AgentMapper;
import com.tbsoo.xtpay.model.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private AgentMapper agentMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Agent agent = agentMapper.selectByAgentNo(s);
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("Roles");
        grantedAuthorities.add(grantedAuthority);
        return new User(String.valueOf(agent.getId()),agent.getAgentPassword(),grantedAuthorities);
    }
}
