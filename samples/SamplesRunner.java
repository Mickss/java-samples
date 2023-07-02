import exceptions.ExceptionSamples;
import numbers.NumbersSamples;

public class SamplesRunner {

    public void run() {

        NumbersSamples numbersSamples = new NumbersSamples();
        numbersSamples.run();

        ExceptionSamples exceptionSamples = new ExceptionSamples();
        exceptionSamples.run();
    }
}
