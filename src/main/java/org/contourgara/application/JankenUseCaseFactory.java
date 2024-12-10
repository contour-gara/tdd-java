package org.contourgara.application;

import lombok.RequiredArgsConstructor;
import org.contourgara.domain.Language;

import java.io.Console;

@RequiredArgsConstructor
public class JankenUseCaseFactory {
    private final Console console;

    public JankenUseCase create() {
        return switch (Language.getLanguageByDisplayName(
                console.readLine(
                        String.format("Select a language from the list. %s: ", Language.getSupportedLanguageOnDisplayName())
                )
        )) {
            case JAPANESE -> new JankenUseCaseByJp();
        };
    }
}
