package at.bbrz.patterns.iterator.custom;

import java.util.Iterator;

public final class CourseCatalog implements Iterable<CourseModule> {
    private final CourseModule root;

    public CourseCatalog(CourseModule root) {
        this.root = root;
    }

    public static CourseCatalog sample() {
        CourseModule java = new CourseModule("Java Grundlagen")
                .add(new CourseModule("Syntax"))
                .add(new CourseModule("Collections"))
                .add(new CourseModule("Exceptions"));

        CourseModule patterns = new CourseModule("Design Patterns")
                .add(new CourseModule("Iterator"))
                .add(new CourseModule("Strategy"));

        CourseModule testing = new CourseModule("Testing")
                .add(new CourseModule("JUnit"))
                .add(new CourseModule("Mockito"));

        CourseModule root = new CourseModule("BBRZ Dev")
                .add(java)
                .add(patterns)
                .add(testing);

        return new CourseCatalog(root);
    }

    public CourseModule root() {
        return root;
    }

    @Override
    public Iterator<CourseModule> iterator() {
        return depthFirstIterator();
    }

    public Iterator<CourseModule> depthFirstIterator() {
        return new DepthFirstModuleIterator(root);
    }

    public Iterator<CourseModule> breadthFirstIterator() {
        return new BreadthFirstModuleIterator(root);
    }

    public Iterator<CourseModule> lessonIterator() {
        return new LeafLessonIterator(root);
    }
}
