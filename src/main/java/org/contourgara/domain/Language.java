package org.contourgara.domain;

public enum Language {
    JAPANESE("日本語"),
    ENGLISH("英語");


    private String name;

    Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
