package com.example.thread;

import org.junit.jupiter.api.Test;

public class SynchronizedStatementExampleTests {

    @Test
    void whenAccessingSynchronizedStatements_threadsDontLockTheWholeObject() throws InterruptedException {
        //will interleave
        var example = new SynchronizedStatementExample();
        new Thread(() -> {
            try {
                example.incrementFirstVariable();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        example.incrementSecondVariable();
    }

    @Test
    void whenAccessingSynchronizedStatements_threadsLockProvidedObject() throws InterruptedException {
        //won't interleave
        var example = new SynchronizedStatementExample();
        new Thread(() -> {
            try {
                example.incrementFirstVariable();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        example.incrementFirstVariable();
    }

    @Test
    void whenAccessingSynchronizedMethods_threadsLockTheWholeObject() throws InterruptedException {
        //won't interleave
        var example = new SynchronizedStatementExample();
        new Thread(() -> {
            try {
                example.incrementThirdVariable();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        example.incrementFourthVariable();
    }
}
