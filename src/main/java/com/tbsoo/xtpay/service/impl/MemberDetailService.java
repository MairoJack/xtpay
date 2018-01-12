package com.tbsoo.xtpay.service.impl;

import com.tbsoo.xtpay.mapper.MemberMapper;
import com.tbsoo.xtpay.model.Member;
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

@Service("memberDetailService")
public class MemberDetailService implements UserDetailsService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Member member = memberMapper.selectMemberByUsername(s);
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("Roles");
        grantedAuthorities.add(grantedAuthority);
        return new User(member.getUsername(),member.getPassword(),grantedAuthorities);
    }
}
