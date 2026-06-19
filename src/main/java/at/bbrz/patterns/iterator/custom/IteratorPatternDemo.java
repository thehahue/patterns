package at.bbrz.patterns.iterator.custom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IteratorPatternDemo {
    private IteratorPatternDemo() {
    }

    public static List<String> demoLines(CourseCatalog catalog) {
        return List.of(
                "Depth first: " + titles(catalog.depthFirstIterator()),
                "Breadth first: " + titles(catalog.breadthFirstIterator()),
                "Nur Lektionen: " + titles(catalog.lessonIterator()),
                "Enhanced for nutzt Iterable.iterator(): " + enhancedForTitles(catalog)
        );
    }

    public static List<String> titles(Iterator<CourseModule> iterator) {
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) {
            titles.add(iterator.next().title());
        }
        return titles;
    }

    private static List<String> enhancedForTitles(CourseCatalog catalog) {
        List<String> titles = new ArrayList<>();
        for (CourseModule module : catalog) {
            titles.add(module.title());
        }
        return titles;
    }
}
