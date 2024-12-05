package org.contourgara.application;

import org.contourgara.domain.Language;

public class JankenUseCaseFactory {
    public static JankenUseCase create() {
        return switch (
                Language.getLanguageByDisplayName(
                        System.console().readLine(
                                String.format("Select a language from the list. %s: ", Language.getSupportedLanguageOnDisplayName())
                        )
                )
                ) {
            case JAPANESE -> new JankenUseCaseByJp();
        };
    }
}
