package com.example.mysql.dto;

import com.example.mysql.enumeration.Gender;
import com.example.mysql.enumeration.Status;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @ToString
@NoArgsConstructor
@EqualsAndHashCode(of="id")
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MemberDTO {
    //    @EqualsAndHashCode.Include
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private Status memberStatus;
    private Gender memberGender;
    private String createdDate;
    private String updatedDate;
}

