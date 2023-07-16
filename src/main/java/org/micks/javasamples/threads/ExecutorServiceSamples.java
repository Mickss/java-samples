package org.micks.javasamples.threads;

import org.micks.javasamples.samples.SamplesRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceSamples implements SamplesRunnable {

    @Override
    public void run() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<?> future = executorService.submit(() -> {
            System.out.println("Running");
            Thread.sleep(7000);
            return "Test";
        });
        try {
            System.out.println("Trying to get response");
            Object o = future.get();
            System.out.println("Result: " + o);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
