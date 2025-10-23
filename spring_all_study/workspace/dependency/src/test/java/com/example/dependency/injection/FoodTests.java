package com.example.dependency.injection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class FoodTests {
    @Autowired
    private Food food;

    @Test
    public void testCoding() {
        log.info("{}", food);
        assertThat(food).isNotNull();
    }

    @Test
    public void testComputer() {
        log.info("{}", food.getKnife());
        assertThat(food.getKnife()).isNotNull();
    }
}
