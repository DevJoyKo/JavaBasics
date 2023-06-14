package com.javabasic.de.java.clip12_quiz2;

public class IllegalPathAccessError extends Error {
    private String path;

    public IllegalPathAccessError(String path) {
        super();
        this.path = path;
    }

    @Override
    public String getMessage() {
        return path + "is not allowed to access." + super.getMessage();
    }
}
