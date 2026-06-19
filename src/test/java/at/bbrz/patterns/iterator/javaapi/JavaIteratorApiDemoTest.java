package at.bbrz.patterns.iterator.javaapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class JavaIteratorApiDemoTest {
    @Test
    void demonstratesCollectionIterator() {
        assertEquals(List.of("ANA", "BERND", "CLARA"), JavaIteratorApiDemo.collectionIteratorExample());
    }

    @Test
    void demonstratesEnhancedForOverIterable() {
        assertEquals(List.of("Iterable", "liefert", "Iterator"), JavaIteratorApiDemo.enhancedForExample());
    }

    @Test
    void demonstratesBidirectionalListIterator() {
        assertEquals(List.of("Ende", "Mitte", "Start"), JavaIteratorApiDemo.listIteratorExample());
    }

    @Test
    void demonstratesScannerAsTokenIterator() {
        assertEquals(List.of("java", "iterator", "pattern"), JavaIteratorApiDemo.scannerIteratorExample());
    }

    @Test
    void demonstratesSpliteratorSplitIntoLeftAndRightPart() {
        assertEquals(List.of("left-A", "left-B", "right-C", "right-D"), JavaIteratorApiDemo.spliteratorExample());
    }
}
