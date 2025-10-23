package com.example.threetier.repository;

import com.example.threetier.domain.MemberVO;
import com.example.threetier.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
// 별 기능은 없지만 Mapper 이름을 자바스럽게 바꿔주기 위한 역할
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

//    추가
    public void save(MemberVO memberVO) {
        memberMapper.insertMember(memberVO);
    }
}
