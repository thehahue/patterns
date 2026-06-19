package at.bbrz.patterns.iterator;

import at.bbrz.patterns.iterator.custom.CourseCatalog;
import at.bbrz.patterns.iterator.custom.IteratorPatternDemo;
import at.bbrz.patterns.iterator.javaapi.JavaIteratorApiDemo;

public class App {
    public static void main(String[] args) {
        CourseCatalog catalog = CourseCatalog.sample();

        System.out.println("== Eigenes Iterator Pattern ==");
        IteratorPatternDemo.demoLines(catalog).forEach(System.out::println);

        System.out.println();
        System.out.println("== Iteratoren in der Java-Standardbibliothek ==");
        JavaIteratorApiDemo.demoLines().forEach(System.out::println);
    }
}
