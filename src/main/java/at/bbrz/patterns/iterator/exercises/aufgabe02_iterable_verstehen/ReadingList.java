package at.bbrz.patterns.iterator.exercises.aufgabe02_iterable_verstehen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class ReadingList implements Iterable<Book> {
    private final List<Book> books = new ArrayList<>();

    public ReadingList add(Book book) {
        books.add(Objects.requireNonNull(book));
        return this;
    }

    public int size() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

    public static ReadingList sample() {
        return new ReadingList()
                .add(new Book("Clean Code", "Robert C. Martin"))
                .add(new Book("Effective Java", "Joshua Bloch"))
                .add(new Book("Head First Design Patterns", "Eric Freeman"));
    }
}
