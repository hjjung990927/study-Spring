package com.example.dependency.injection;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class CodingTests {
//    단위테스트에서는 필드 주입을 쓰자.
    @Autowired
    private Coding coding;

    @Test
    public void testCoding() {
        log.info("{}", coding);
        assertThat(coding).isNotNull();
//        log.info(coding): 객체로 불러오기에 오류
    }

    @Test
    public void testComputer() {
        log.info("{}", coding.getComputer());
        assertThat(coding.getComputer()).isNotNull();
    }
}
