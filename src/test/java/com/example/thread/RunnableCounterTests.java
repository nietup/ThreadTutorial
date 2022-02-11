package com.example.thread;

import org.junit.jupiter.api.Test;

public class RunnableCounterTests {
    @Test
    void whenCoupleOfThreadsRun_theyShouldRunAtTheSameTime() throws InterruptedException {
        Thread last = null;

        for (int i = 0; i < 3; i++) {
            last = new Thread(new RunnableCounter(null));
            last.start();
        }

        last.join();
    }
}
