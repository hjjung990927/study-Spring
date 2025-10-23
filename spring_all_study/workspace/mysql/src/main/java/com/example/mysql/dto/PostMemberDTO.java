package com.example.mysql.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
// post 인데 member와 조인
public class PostMemberDTO {
    private Long id;
    private String postTitle;
    private String postContent;
    private int postReadCount;
    private String memberId;
    private String memberName;
    private String createdDate;
    private String updatedDate;
}
