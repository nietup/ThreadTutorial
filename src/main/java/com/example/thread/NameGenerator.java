package com.example.thread;

public interface NameGenerator {
    void appendName(final String[] nameParts) throws InterruptedException;
}
