package org.micks.javasamples.set_samples;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class WordRepository {

    private final Set<@NotNull String> words = new HashSet<>();

    public void addWord(String word) {
        if (word != null) {
            words.add(word.toLowerCase());
        }
    }

    public void addWords(Collection<String> newWords) {
        for (String word : newWords) {
            if (word != null) {
                words.add(word.toLowerCase());
            }
        }
    }

    public List<@NotNull String> getWordsSorted() {
        List<String> sorted = new ArrayList<>(words);
        Collections.sort(sorted);
        return sorted;
    }

    public Set<@NotNull String> getCommonWords(Set<String> other) {
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
