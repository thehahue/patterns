package at.bbrz.patterns.iterator.exercises.aufgabe05_tree_iterator;

public record FileEntry(String path) {
    @Override
    public String toString() {
        return path;
    }
}
