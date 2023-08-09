package org.micks.javasamples.samples;

import org.micks.javasamples.exceptions.ExceptionSamples;
import org.micks.javasamples.lists.ListsSamples;
import org.micks.javasamples.numbers.NumbersSamples;
import org.micks.javasamples.threads.ExecutorServiceSamples;
import org.micks.javasamples.threads.ThreadsSamples;

import java.util.List;

public class SamplesRunner {

    List<SamplesRunnable> samples = List.of(
            new NumbersSamples(),
            new ExceptionSamples(),
            new ThreadsSamples(),
            new ExecutorServiceSamples(),
            new ListsSamples()
    );

    public void initSamples() {

        for (SamplesRunnable sample : samples) {
            try {
                sample.run();
            } catch (Exception e) {
                System.out.println("Example ended with exception: " + e);
            }
        }
    }
}
