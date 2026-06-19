package at.bbrz.patterns.iterator.custom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class LeafLessonIterator implements Iterator<CourseModule> {
    private final Iterator<CourseModule> modules;
    private CourseModule nextLesson;

    public LeafLessonIterator(CourseModule root) {
        this.modules = new DepthFirstModuleIterator(root);
        advance();
    }

    @Override
    public boolean hasNext() {
        return nextLesson != null;
    }

    @Override
    public CourseModule next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        CourseModule result = nextLesson;
        advance();
        return result;
    }

    private void advance() {
        nextLesson = null;
        while (modules.hasNext() && nextLesson == null) {
            CourseModule candidate = modules.next();
            if (candidate.isLesson()) {
                nextLesson = candidate;
            }
        }
    }
}
