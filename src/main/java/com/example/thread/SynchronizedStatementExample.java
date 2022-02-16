package com.example.thread;

public class SynchronizedStatementExample {
    private Integer firstVariable = 0;
    private final Object firstVariableIntrinsicLockProvider = new Object();
    private Integer secondVariable = 0;
    private final Object secondVariableIntrinsicLockProvider = new Object();
    private Integer thirdVariable = 0;
    private Integer fourthVariable = 0;

    void incrementFirstVariable() throws InterruptedException {
        synchronized (firstVariableIntrinsicLockProvider) {
            System.out.println("incrementing first variable...");
            firstVariable++;
            Thread.sleep(1000);
            System.out.println("first variable incremented");
        }
    }

    void incrementSecondVariable() throws InterruptedException {
        synchronized (secondVariableIntrinsicLockProvider) {
            System.out.println("incrementing second variable...");
            secondVariable++;
            Thread.sleep(1000);
            System.out.println("second variable incremented");
        }
    }

    synchronized void incrementThirdVariable() throws InterruptedException {
        System.out.println("incrementing third variable...");
        thirdVariable++;
        Thread.sleep(1000);
        System.out.println("third variable incremented");
    }

    synchronized void incrementFourthVariable() throws InterruptedException {
        System.out.println("incrementing fourth variable...");
        fourthVariable++;
        Thread.sleep(1000);
        System.out.println("fourth variable incremented");
    }
}
