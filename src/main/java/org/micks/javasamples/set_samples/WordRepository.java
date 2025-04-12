package org.micks.javasamples.set_samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class WordRepository {

    private final Set<String> words = new HashSet<>();

    public void addWord(String word) {
        Optional.ofNullable(word)
                .map(String::toLowerCase)
                .ifPresent(words::add);
    }

    public void addWords(Collection<String> newWords) {
        Optional.ofNullable(newWords)
                .ifPresent(list -> words.addAll(
                        list.stream()
                                .filter(Objects::nonNull)
                                .map(String::toLowerCase)
                                .collect(Collectors.toSet())
                ));
    }

    public List<String> getWordsSorted() {
        List<String> sorted = new ArrayList<>(words);
        Collections.sort(sorted);
        return sorted;
    }

    public Set<String> getCommonWords(Set<String> other) {
        return words.stream()
                .filter(other::contains)
                .collect(Collectors.toSet());
    }

    public Set<String> getUniqueWords(Set<String> other) {
        return words.stream()
                .filter(word -> !other.contains(word))
                .collect(Collectors.toSet());
    }

    public boolean containsWord(String word) {
        return words.contains(word.toLowerCase());
    }
}
