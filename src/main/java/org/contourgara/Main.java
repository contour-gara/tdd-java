package org.contourgara;

import org.contourgara.application.JankenUseCaseFactory;

public class Main {
    public static void main(String[] args) {
        JankenUseCaseFactory.create().execute();
    }
}
