package com.yns.cor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static java.util.Optional.ofNullable;

public class Message {

    private final Map<String, String> content;

    public Message(Map<String, String> content) {
        this.content = content;
    }

    public Optional<String> getValue(String field) {
        return ofNullable(content.get(field));
    }

    public Message with(String field, String value) {
        final var contentCopy = new HashMap<>(content);
        contentCopy.put(field, value);
        return new Message(contentCopy);
    }

    @Override
    public String toString() {
        return "Message{" +
                "content=" + content +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Message m = (Message) o;
        return this.content.equals(m.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
