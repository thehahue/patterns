package at.bbrz.patterns.iterator.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class CourseModule {
    private final String title;
    private final List<CourseModule> children = new ArrayList<>();

    public CourseModule(String title) {
        this.title = Objects.requireNonNull(title);
    }

    public CourseModule add(CourseModule child) {
        children.add(Objects.requireNonNull(child));
        return this;
    }

    public String title() {
        return title;
    }

    public List<CourseModule> children() {
        return Collections.unmodifiableList(children);
    }

    public boolean isLesson() {
        return children.isEmpty();
    }

    @Override
    public String toString() {
        return title;
    }
}
