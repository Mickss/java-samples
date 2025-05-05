package org.micks.javasamples.streams_samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquaringNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testSquareNumbers() {
        SquaringNumbers squaringNumbers = new SquaringNumbers();
        List<Integer> input = Arrays.asList(1, -2, 3, 4, -5);
        List<Integer> expected = Arrays.asList(1, 9, 16);
        assertEquals(expected, squaringNumbers.squareNumbers(input));
    }
}