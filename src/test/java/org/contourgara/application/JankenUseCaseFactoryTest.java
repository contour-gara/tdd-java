package org.contourgara.application;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.Console;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class JankenUseCaseFactoryTest {
    @Mock
    Console console;

    @InjectMocks
    JankenUseCaseFactory sut;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void 日本語用のクラスを生成できる() {
        // set up
        doReturn("日本語").when(console).readLine(anyString());

        // execute
        JankenUseCase actual = sut.create();

        // assert
        assertThat(actual).isInstanceOf(JankenUseCaseByJp.class);
    }
}
