package com.tbsoo.xtpay.mapper;

import com.tbsoo.xtpay.model.Member;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository("memberMapper")
public interface MemberMapper {
    @Select("SELECT id,username,password from xtpay_member where id = #{id}")
    @ResultType(Member.class)
    Member selectByPrimaryKey(Long id);

    @Select("SELECT id,username,password from xtpay_member where username = #{username}")
    @ResultType(Member.class)
    Member selectMemberByUsername(String username);
}
