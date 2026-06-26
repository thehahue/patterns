package at.bbrz.patterns.iterator.exercises.aufgabe02_iterable_verstehen;

public final class ReadingListDemo {
    private ReadingListDemo() {
    }

    public static void main(String[] args) {
        ReadingList readingList = ReadingList.sample();

        for (Book book : readingList) {
            System.out.println(book.title() + " von " + book.author());
        }
    }
}
