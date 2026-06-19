package at.bbrz.patterns.iterator.custom;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class DepthFirstModuleIterator implements Iterator<CourseModule> {
    private final Deque<CourseModule> stack = new ArrayDeque<>();

    public DepthFirstModuleIterator(CourseModule root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public CourseModule next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        CourseModule current = stack.pop();
        List<CourseModule> children = current.children();
        for (int i = children.size() - 1; i >= 0; i--) {
            stack.push(children.get(i));
        }
        return current;
    }
}
