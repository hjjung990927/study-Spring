package com.example.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

@SpringBootTest
@Slf4j
public class RestaurantTests {
    @Autowired
    Restaurant outback;

    @Autowired
    @Qualifier("vips")
    Restaurant vips;

    @Test
    public void testOutback() {
        log.info("outback: {}", outback);
        log.info("selfBar: {}", outback.selfBar());
    }

    @Test
    public void testVips() {
        log.info("vips: {}", vips);
        log.info("selfBar: {}", vips.selfBar());
    }
}
