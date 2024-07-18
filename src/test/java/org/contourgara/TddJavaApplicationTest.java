package org.contourgara;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddJavaApplicationTest {
    @Autowired
    FizzBuzzController fizzBuzzController;

    @Test
    void contextLoads() {
        assertThat(fizzBuzzController).isNotNull();
    }
}
