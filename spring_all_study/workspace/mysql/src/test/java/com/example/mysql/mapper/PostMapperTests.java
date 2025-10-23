package com.example.mysql.mapper;

import com.example.mysql.domain.MemberVO;
import com.example.mysql.domain.PostVO;
import com.example.mysql.dto.PostMemberDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostMapperTests {
    @Autowired
    private PostMapper postMapper;

//    게시글 추가
    @Test
    public void testAddPost() {
        PostVO postVO = new PostVO();
        postVO.setPostTitle("테스트 제목2");
        postVO.setPostContent("테스트 내용2");
        postVO.setMemberId("2");

        postMapper.addPost(postVO);
    }

//    게시글 조회
    @Test
    public void testSelectById() {
        PostMemberDTO postMemberDTO = postMapper.selectById(1L);
        System.out.println(postMemberDTO);
    }

//    게시글 수정
    @Test
    public void testUpdatePost() {
        PostVO postVO = new PostVO();
        postVO.setPostTitle("테스트 제목2");
        postVO.setPostContent("수정된 내용2");
        postVO.setMemberId("2");

        postMapper.updatePost(postVO);
    }

//    게시글 삭제
    @Test
    public void testDeletePost() {
        PostVO postVO = new PostVO();
        postVO.setMemberId("2");

        postMapper.deletePost(postVO);
    }

//    게시글 목록
    @Test
    public void testFindAllPost() {
        List<PostVO> allPost = postMapper.findAllPost();
        for(PostVO postVO : allPost) {
            System.out.println(postVO);
        }
    }
}
