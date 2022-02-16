package com.example.thread;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;

public class WaitNotifyExampleTests {
    @Test
    void test() throws InterruptedException {
        var example = new WaitNotifyExample();
        new Thread(example::awaitCondition).start();
        sleep(1000);
        example.fulfillCondition();
    }
}
