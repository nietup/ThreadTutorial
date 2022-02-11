package com.example.thread;

public class RunnableCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
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