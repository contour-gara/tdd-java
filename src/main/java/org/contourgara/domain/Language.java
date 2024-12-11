package org.contourgara.domain;

import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Language {
    JAPANESE("日本語"),
    ENGLISH("English"),;

     private final String displayName;

     public static List<String> getSupportedLanguageOnDisplayName() {
         return Arrays.stream(values()).map(language -> language.displayName).toList();
     }

     public static Language getLanguageByDisplayName(String languageName) {
         return Arrays.stream(values())
                 .filter(type -> type.displayName.equals(languageName))
                 .findFirst()
                 .orElseThrow(() -> new IllegalArgumentException(String.format("Language '%s' is not supported", languageName)));
     }
}
