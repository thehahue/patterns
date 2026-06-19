package at.bbrz.patterns.iterator.custom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class CourseCatalogTest {
    private final CourseCatalog catalog = CourseCatalog.sample();

    @Test
    void iteratesDepthFirstByDefault() {
        assertEquals(
                List.of(
                        "BBRZ Softwarekurs",
                        "Java Grundlagen",
                        "Syntax",
                        "Collections",
                        "Exceptions",
                        "Design Patterns",
                        "Iterator",
                        "Strategy",
                        "Testing",
                        "JUnit",
                        "Mockito"
                ),
                IteratorPatternDemo.titles(catalog.iterator())
        );
    }

    @Test
    void iteratesBreadthFirstWithoutChangingTheCollection() {
        assertEquals(
                List.of(
                        "BBRZ Softwarekurs",
                        "Java Grundlagen",
                        "Design Patterns",
                        "Testing",
                        "Syntax",
                        "Collections",
                        "Exceptions",
                        "Iterator",
                        "Strategy",
                        "JUnit",
                        "Mockito"
                ),
                IteratorPatternDemo.titles(catalog.breadthFirstIterator())
        );
    }

    @Test
    void iteratesOnlyLeafLessons() {
        assertEquals(
                List.of("Syntax", "Collections", "Exceptions", "Iterator", "Strategy", "JUnit", "Mockito"),
                IteratorPatternDemo.titles(catalog.lessonIterator())
        );
    }
}
