package com.example.mysql.mapper;

import com.example.mysql.domain.MemberVO;
import com.example.mysql.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// @: Annotation
@Mapper
public interface MemberMapper {
//    회원가입
    public void join(MemberVO memberVO);
    
//    로그인
    public MemberDTO login(String memberEmail, String memberPassword);

//    이메일로 정보 조회
    public MemberDTO checkByEmail(String memberEmail);

//    이메일 중복 검사
//    집계 함수(count(*))
//    select count(*) from tbl_member: 회원 테이블 총 정보 개수
//    이메일로 조회 시 결과가 0개면 중복 없음
//    이메일로 조회 시 결과가 1개면 중복 있음
//    이메일 검사 시 where 절을 작성해야 한다.
    public int duplicateEmail(String memberEmail);

//    회원 10명 추가 후 전체 회원목록 조회
    public List<MemberDTO> findAll();
}

