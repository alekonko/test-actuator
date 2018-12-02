package com.aleconco.test_actuator;

public class Messages {

    private final long id;
    private final String content;

    public Messages(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}