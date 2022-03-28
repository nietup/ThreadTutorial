package com.example.thread;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExampleTests {

    @Test
    void recursiveActionSplitsWorkBetweenThreadsAndJoinsThem() {
        new ForkJoinPool().invoke(new ForkJoinExample(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)));
    }

}
