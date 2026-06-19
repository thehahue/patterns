package at.bbrz.patterns.iterator.javaapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.stream.StreamSupport;

public final class JavaIteratorApiDemo {
    private JavaIteratorApiDemo() {
    }

    public static List<String> demoLines() {
        return List.of(
                "Collection.iterator(): " + collectionIteratorExample(),
                "Iterable + for-each: " + enhancedForExample(),
                "ListIterator vor/zurueck: " + listIteratorExample(),
                "Scanner als Iterator ueber Tokens: " + scannerIteratorExample(),
                "Spliterator teilt Traversierung: " + spliteratorExample()
        );
    }

    public static List<String> collectionIteratorExample() {
        List<String> names = new ArrayList<>(List.of("Ana", "Bernd", "Clara"));
        Iterator<String> iterator = names.iterator();

        List<String> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next().toUpperCase());
        }
        return result;
    }

    public static List<String> enhancedForExample() {
        Iterable<String> iterable = List.of("Iterable", "liefert", "Iterator");
        List<String> result = new ArrayList<>();

        for (String word : iterable) {
            result.add(word);
        }
        return result;
    }

    public static List<String> listIteratorExample() {
        List<String> steps = List.of("Start", "Mitte", "Ende");
        ListIterator<String> iterator = steps.listIterator(steps.size());

        List<String> backwards = new ArrayList<>();
        while (iterator.hasPrevious()) {
            backwards.add(iterator.previous());
        }
        return backwards;
    }

    public static List<String> scannerIteratorExample() {
        List<String> tokens = new ArrayList<>();
        try (Scanner scanner = new Scanner("java iterator pattern")) {
            while (scanner.hasNext()) {
                tokens.add(scanner.next());
            }
        }
        return tokens;
    }

    public static List<String> spliteratorExample() {
        Spliterator<String> rightPart = Arrays.asList("A", "B", "C", "D").spliterator();
        Spliterator<String> leftPart = rightPart.trySplit();

        List<String> result = new ArrayList<>();
        if (leftPart != null) {
            StreamSupport.stream(leftPart, false)
                    .map(value -> "left-" + value)
                    .forEach(result::add);
        }
        StreamSupport.stream(rightPart, false)
                .map(value -> "right-" + value)
                .forEach(result::add);
        return result;
    }
}
