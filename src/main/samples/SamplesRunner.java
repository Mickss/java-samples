package samples;

import exceptions.ExceptionSamples;
import numbers.NumbersSamples;

import java.util.List;

public class SamplesRunner {

    List<SamplesRunnable> samples = List.of(
            new NumbersSamples(),
            new ExceptionSamples()
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
