package com.example.thread;

import java.util.Objects;

public record RunnableCounter(Integer interruptAt) implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (interruptAt != null && Objects.equals(i, interruptAt)) {
                Thread.currentThread().interrupt();
            }

            System.out.println("thread: " + Thread.currentThread().getName()
                    + " count: " + i
                    + " interrupted: " + Thread.interrupted());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}