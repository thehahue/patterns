package at.bbrz.patterns.iterator.exercises.aufgabe01_iterator_nutzen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WordCollector {
    private WordCollector() {
    }

    public static List<String> collectUppercase(List<String> words) {
        List<String> result = new ArrayList<>();

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next().toUpperCase());
        }

        return result;
    }
}
