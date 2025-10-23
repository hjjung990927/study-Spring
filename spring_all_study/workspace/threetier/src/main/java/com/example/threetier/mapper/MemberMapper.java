package com.example.threetier.mapper;

import com.example.threetier.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
//    추가
    public void insertMember(MemberVO memberVO);

//    조회
//    삭제
//    수정
}
