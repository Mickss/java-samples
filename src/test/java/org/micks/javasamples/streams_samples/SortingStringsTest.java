package org.micks.javasamples.streams_samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingStringsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testWords() {
        SortingStrings sortingStrings = new SortingStrings();
        List<String> input = Arrays.asList("apple", "kiwi", "banana", "grape", "chery", "fig");
        List<String> expected = Arrays.asList("APPLE", "BANANA", "CHERY", "GRAPE");
        assertEquals(expected, sortingStrings.sortingString(input));
    }
}