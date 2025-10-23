package com.example.mysql.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class TestVOTests {
    @Test
    public void testBuilder(){
        TestVO test = TestVO.builder().name("정희준").age(20).build();
        log.info(test.toString());
    }
}
