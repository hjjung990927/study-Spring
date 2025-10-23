package com.example.mysql.domain;

import com.example.mysql.audit.Period;
import com.example.mysql.enumeration.Gender;
import com.example.mysql.enumeration.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Component;

@Getter @ToString
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//@Builder
@SuperBuilder
@EqualsAndHashCode(of="id")
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MemberVO extends Period {
    //    @EqualsAndHashCode.Include
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private Status memberStatus;
    private Gender memberGender;
}

// 외부에서 수정 막고 오로지 Getter 역할만
// SuperBuilder: 부모껏도 가져온다. 그래서 extends 된 class도 SuperBuilder를 붙여준다.