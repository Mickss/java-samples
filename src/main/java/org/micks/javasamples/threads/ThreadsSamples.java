package org.micks.javasamples.threads;

import org.micks.javasamples.samples.SamplesRunnable;

public class ThreadsSamples implements SamplesRunnable {

    @Override
    public void run() {
        new Thread(new Task1()).start();

        new Thread(() -> {
            try {
                System.out.println("Task 2 started");
                Thread.sleep(6000);
                System.out.println("Task 2 ended");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private static class Task1 implements Runnable {

        @Override
        public void run() {

            try {
                System.out.println("Task 1 started");
                Thread.sleep(10000);
                System.out.println("Task 1 ended");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
