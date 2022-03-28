package com.example.thread;

import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ForkJoinExample extends RecursiveAction {

    public static final int THRESHOLD = 3;
    private final List<Integer> data;

    public ForkJoinExample(List<Integer> data) {
        this.data = data;
    }

    @SneakyThrows
    @Override
    protected void compute() {

        Thread.sleep(1000);

        if (data.size() < THRESHOLD) {
            System.out.println("Processing chunk: " + data);
        } else {
            System.out.println("Chunk too big: " + data);
            var size = data.size();
            var limit = size / 2;
            invokeAll(new ForkJoinExample(data.subList(0, limit)), new ForkJoinExample(data.subList(limit, size)));
        }
    }
}
