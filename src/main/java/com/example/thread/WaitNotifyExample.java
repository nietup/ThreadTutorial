package com.example.thread;

import lombok.SneakyThrows;

public class WaitNotifyExample {
    private boolean condition = false;

    @SneakyThrows
    synchronized void awaitCondition() {
        System.out.println("before wait");
        while (!condition) {
            wait();
        }
        System.out.println("after wait");
    }

    synchronized void fulfillCondition() {
        condition = true;
        notifyAll();
    }
}
