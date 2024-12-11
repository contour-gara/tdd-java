package org.contourgara.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class LanguageTest {
    @Test
    void サポートしてる言語の表示名を取得できる() {
        // execute
        List<String> actual = Language.getSupportedLanguageOnDisplayName();

        // assert
        List<String> expected = List.of("日本語", "English");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 表示名から言語を取得できる() {
        // execute
        Language actual = Language.getLanguageByDisplayName("日本語");

        // assert
        Language expected = Language.JAPANESE;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void サポートしていない言語の表示名から言語を取得した場合例外が返る() {
        // execute & assert
        assertThatThrownBy(() -> Language.getLanguageByDisplayName("存在しない言語"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Language '存在しない言語' is not supported");
    }
}
