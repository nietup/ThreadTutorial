package com.example.thread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class NonSynchronizedNameGeneratorTests {
    @Test
    void whenMultipleThreadsInvokeNonSynchronizedMethod_thenResultIsNotDeterministic() throws InterruptedException {
        final var generator = new NonSynchronizedNameGenerator();
        final var threads = new ArrayList<Thread>();
        for (int i = 0; i < 3; i++) {
            var thread = new Thread(new NameGeneratorRunner(generator, new String[]{"t" + i + "p0_",
                    "t" + i + "p1_",
                    "t" + i + "p2_"}));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }
}
