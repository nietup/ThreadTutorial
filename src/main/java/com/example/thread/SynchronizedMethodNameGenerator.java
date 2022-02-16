package com.example.thread;

public class SynchronizedMethodNameGenerator implements NameGenerator {
    private String name = "";

    @Override
    public synchronized void appendName(final String[] nameParts) throws InterruptedException {
        for (final String part: nameParts) {
            name += part;
            System.out.println("name: " + name);
            Thread.sleep(1000);
        }
    }
}
