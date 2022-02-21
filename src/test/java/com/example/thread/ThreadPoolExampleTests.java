package com.example.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class ThreadPoolExampleTests {
    @Test
    void fixedThreadPool_runsFixedNumberOfThreadsAtATimeAndEnqueuesAdditionalThreads() throws InterruptedException {
        final var threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(new RunnableCounter(null));
        threadPool.execute(new RunnableCounter(null));
        threadPool.execute(new RunnableCounter(null));

        sleep(11000);
    }
}
