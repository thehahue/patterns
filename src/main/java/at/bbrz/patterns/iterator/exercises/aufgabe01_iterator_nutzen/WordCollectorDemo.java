package at.bbrz.patterns.iterator.exercises.aufgabe01_iterator_nutzen;

import java.util.List;

public final class WordCollectorDemo {
    private WordCollectorDemo() {
    }

    public static void main(String[] args) {
        List<String> words = List.of("java", "iterator", "pattern");
        System.out.println(WordCollector.collectUppercase(words));
    }
}
