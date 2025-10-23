package com.example.mysql.mapper;

import com.example.mysql.domain.PostVO;
import com.example.mysql.dto.PostMemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
//    게시글 추가
    public void addPost(PostVO postVO);

//    게시글 조회
    public PostMemberDTO selectById(Long id);

//    게시글 수정
    public void updatePost(PostVO postVO);

//    게시글 삭제
    public void deletePost(PostVO postVO);

//    게시글 목록
    public List<PostVO> findAllPost();
}
