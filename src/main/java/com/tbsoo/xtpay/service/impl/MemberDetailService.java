package com.tbsoo.xtpay.service.impl;

import com.tbsoo.xtpay.mapper.MemberMapper;
import com.tbsoo.xtpay.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("memberDetailService")
public class MemberDetailService implements UserDetailsService{

    @Autowired
    private MemberMapper memberMapper;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Member member = memberMapper.selectMemberByUsername(s);

        return new User(member.getUsername(),member.getPassword(),null);
    }
}
