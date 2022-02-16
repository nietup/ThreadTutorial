package com.example.thread;

import org.junit.jupiter.api.Test;

public class SynchronizedOnThisExampleTests {
    @Test
    void whenSomeCodeIsInsideSynchronizedOnThisBlock_thenTheCodeBeforeTheBlockInterleaves() {
        var example = new SynchronizedOnThisExample();
        new Thread(example::synchronizedOnThis).start();
        example.synchronizedOnThis();
    }
}
