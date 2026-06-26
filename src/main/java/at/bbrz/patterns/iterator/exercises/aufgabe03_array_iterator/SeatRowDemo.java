package at.bbrz.patterns.iterator.exercises.aufgabe03_array_iterator;

public final class SeatRowDemo {
    private SeatRowDemo() {
    }

    public static void main(String[] args) {
        for (Seat seat : SeatRow.sample()) {
            System.out.println(seat);
        }
    }
}
