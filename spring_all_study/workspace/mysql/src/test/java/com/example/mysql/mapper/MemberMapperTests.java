package com.example.mysql.mapper;

import com.example.mysql.domain.MemberVO;
import com.example.mysql.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    private MemberMapper memberMapper;

//    회원가입
//    객체 관계 구성이 아니라 MemberVO memberVO; 가 아닌 객체를 생성 후 주입하자
    @Test
    public void testJoin() {
//        MemberVO memberVO = new MemberVO();
//        memberVO.setMemberName("test02");
//        memberVO.setMemberEmail("test02@gmail.com");
//        memberVO.setMemberPassword("1234");
//        memberVO.setMemberGender("man");
        MemberVO memberVO = MemberVO.builder()
                .memberPassword("1234")
                .memberName("test")
                .build();

        memberMapper.join(memberVO);

        log.info("inserted id: {}", memberVO.getId());
    }

//    로그인
    @Test
    public void testLogin() {
//        MemberVO memberVO = new MemberVO();
//        memberVO.setMemberEmail("test01@gmail.com");
//        memberVO.setMemberPassword("1234");
//
//        Assertions.assertThat(memberMapper.login(memberEmail, memberPassword)).isNotNull();
//
//        log.info("로그인 한 회원: {}", memberMapper.login(memberEmail, memberPassword));

        String memberEmail = "test@gmail.com";
        String memberPassword = "1234";

        //        Ctrl + 클릭: 선언부로 이동
        MemberDTO memberDTO = memberMapper.login(memberEmail, memberPassword);
        if (memberDTO != null) { // 로그인 성공
            System.out.println(memberDTO);
        } else { // 로그인 실패
            System.out.println("로그인 실패!");
        }
    }

//    이메일로 정보 조회
    @Test
    public void testCheckByEmail() {
//        MemberVO memberVO = new MemberVO();
//        memberVO.setMemberEmail("test01@gmail.com");
//
//        Assertions.assertThat(memberMapper.checkByEmail(memberVO.getMemberEmail())).isNotNull();
//
//        log.info("찾은 회원: {}", memberMapper.checkByEmail(memberVO.getMemberEmail()));

        String memberEmail = "test@gmail.com";
//        자동 매핑 단축키: Ctrl + Alt + v(value)
        MemberDTO member = memberMapper.checkByEmail(memberEmail);
        if (member != null) {
            System.out.println(member);
        } else {
            System.out.println("존재하지 않는 이메일입니다.");
        }
    }

    @Test
//    이메일 중복 검사
    public void testDuplicateEmail() {
        String memberEmail = "test0@gmail.com";
        int count = memberMapper.duplicateEmail(memberEmail);
        if(count == 0) {
            System.out.println("중복 없음");
        } else {
            System.out.println("중복!");
        }
    }

    @Test
//    회원 10명 추가 후 전체 회원목록 조회
    public void testFindAll() {
        List<MemberDTO> members = memberMapper.findAll();
        for(MemberDTO memberDTO : members) {
            System.out.println(memberDTO);
        }
    }
}
