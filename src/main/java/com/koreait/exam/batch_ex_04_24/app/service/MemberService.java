package com.koreait.exam.batch_ex_04_24.app.service;

import com.koreait.exam.batch_ex_04_24.app.member.entity.Member;
import com.koreait.exam.batch_ex_04_24.app.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member join(String username, String password, String email) {
        Member member = Member.builder()
                .username(username)
                .password(password)
                .email(email).build();

        memberRepository.save(member);

        return member;
    }
}