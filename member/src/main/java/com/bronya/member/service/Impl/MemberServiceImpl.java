package com.bronya.member.service.Impl;

import com.bronya.member.domain.entity.Member;
import com.bronya.member.mapper.MemberMapper;
import com.bronya.member.service.MemberService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author bronya
 * @create 2024/4/23
 * @since 1.0.0
 */
@Service
@Slf4j
public class MemberServiceImpl  implements MemberService {

    @Resource
    private MemberMapper memberMapper;
    @Override
    public int count() {

        return memberMapper.count();
    }

    @Override
    public long register(String mobile) {
        if(memberMapper.selectByMobile(mobile)) {
            throw new RuntimeException("该手机号已被注册");
        }
        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        log.info("用户注册成功，用户信息为：{}", member);
        memberMapper.insertOne(member);
        return member.getId();
    }
}