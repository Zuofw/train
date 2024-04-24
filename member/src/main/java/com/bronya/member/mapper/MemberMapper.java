package com.bronya.member.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bronya.member.domain.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {
    int count();

    void insertOne(Member member);

    boolean selectByMobile(String mobile);
}
