package com.example.threetier.mapper;

import com.example.threetier.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testInsertMember() {
        MemberVO member = MemberVO.builder()
                .memberEmail("test@gmail.com")
                .memberPassword("1234")
                .memberName("test")
                .build();

        memberMapper.insertMember(member);
    }
}
