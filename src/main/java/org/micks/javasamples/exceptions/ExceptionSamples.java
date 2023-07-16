package org.micks.javasamples.exceptions;

import org.micks.javasamples.samples.SamplesRunnable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionSamples implements SamplesRunnable {

    @Override
    public void run() {

        writeFileSafely();
        try {
            writeFileOptimistic();
        } catch (IOException e) {
            System.out.println("Error while writing to file" + e);
        }

        try {
            int result = divide(10, 2);
            System.out.println("Divide result is: " + result);
            int result2 = divide(12, 0);
            System.out.println("Divide result is: " + result2);
        } catch (Exception e) {
            System.out.println("Error while dividing" + e);
            throw new RuntimeException(e);
        }
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private void writeFileSafely() {

        File file = new File("file.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Its only test");
        } catch (IOException e) {
            System.out.println("Error while writing to file" + e);
            throw new RuntimeException(e);
        }
    }

    private void writeFileOptimistic() throws IOException {

        File file = new File("file2.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Its only test");
        }
    }
}
