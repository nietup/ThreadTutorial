package com.example.thread;

import lombok.SneakyThrows;

public class NameGeneratorRunner implements Runnable {
    private final NameGenerator nameGenerator;
    private final String[] modifications;

    public NameGeneratorRunner(NameGenerator nameGenerator, String[] modifications) {
        this.nameGenerator = nameGenerator;
        this.modifications = modifications;
    }

    @SneakyThrows
    @Override
    public void run() {
        nameGenerator.appendName(modifications);
    }
}
