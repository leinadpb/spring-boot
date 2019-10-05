package com.leinad.core.models;

public class HelloModel {
    private String message;

    public HelloModel(String name) {
        this.message = String.format("Hello %s", name);
    }
    public HelloModel() {
        this.message = "Hello there!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
