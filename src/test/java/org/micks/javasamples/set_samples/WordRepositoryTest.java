package org.micks.javasamples.set_samples;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordRepositoryTest {

    @Test
    void testAddAndContains() {
        WordRepository repo = new WordRepository();
        repo.addWord("Java");
        assertTrue(repo.containsWord("java"));
    }

    @Test
    void testAddWordsAndGetSorted() {
        WordRepository repo = new WordRepository();
        repo.addWords(List.of("Banana", "Apple", "Carrot"));
        assertEquals(List.of("apple", "banana", "carrot"), repo.getWordsSorted());
    }

    @Test
    void testGetCommonWords() {
        WordRepository repo = new WordRepository();
        repo.addWords(Set.of("dog", "cat", "mouse"));
        Set<String> other = Set.of("cat", "lion", "dog");
        assertEquals(Set.of("cat", "dog"), repo.getCommonWords(other));
    }

    @Test
    void testGetUniqueWords() {
        WordRepository repo = new WordRepository();
        repo.addWords(Set.of("sun", "moon", "stars"));
        Set<String> other = Set.of("moon", "galaxy");
        assertEquals(Set.of("sun", "stars"), repo.getUniqueWords(other));
    }
}
