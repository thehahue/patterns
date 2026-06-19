package at.bbrz.patterns.iterator.custom;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public final class BreadthFirstModuleIterator implements Iterator<CourseModule> {
    private final Queue<CourseModule> queue = new ArrayDeque<>();

    public BreadthFirstModuleIterator(CourseModule root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public CourseModule next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        CourseModule current = queue.remove();
        queue.addAll(current.children());
        return current;
    }
}
