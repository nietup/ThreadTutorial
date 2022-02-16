package com.example.thread;

import lombok.SneakyThrows;

import static java.lang.Thread.sleep;

public class SynchronizedOnThisExample {
    @SneakyThrows
    void synchronizedOnThis() {
        System.out.println("before synchronized block");
        sleep(1000);
        synchronized (this) {
            System.out.println("inside synchronized block");
            sleep(1000);
        }
        System.out.println("after synchronized block");
    }
}
