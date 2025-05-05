package org.micks.javasamples.streams_samples;

import java.util.List;
import java.util.stream.Collectors;

public class SortingStrings {

    public List<String> sortingString(List<String> word){
        return word.stream()
                .filter(w -> w.length() >= 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
    }
}
