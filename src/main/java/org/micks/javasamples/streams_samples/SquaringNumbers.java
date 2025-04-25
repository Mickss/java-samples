package org.micks.javasamples.streams_samples;

import java.util.List;
import java.util.stream.Collectors;

public class SquaringNumbers {

    public List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}
