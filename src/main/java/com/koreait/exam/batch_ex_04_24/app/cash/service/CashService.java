package com.koreait.exam.batch_ex_04_24.app.cash.service;

import com.koreait.exam.batch_ex_04_24.app.cash.entity.CashLog;
import com.koreait.exam.batch_ex_04_24.app.cash.repository.CashRepository;
import com.koreait.exam.batch_ex_04_24.app.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashService {
    private final CashRepository cashRepository;

    public CashLog addCash(Member member, long price, String eventType) {
        CashLog cashLog = CashLog.builder()
                .member(member)
                .price(price)
                .eventType(eventType)
                .build();

        cashRepository.save(cashLog);

        return cashLog;
    }
}
