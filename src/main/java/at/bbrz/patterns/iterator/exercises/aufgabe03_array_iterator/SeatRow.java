package at.bbrz.patterns.iterator.exercises.aufgabe03_array_iterator;

import java.util.Iterator;

public final class SeatRow implements Iterable<Seat> {
    private final Seat[] seats;

    public SeatRow(Seat[] seats) {
        this.seats = seats.clone();
    }

    @Override
    public Iterator<Seat> iterator() {
        return new SeatRowIterator(seats);
    }

    public static SeatRow sample() {
        return new SeatRow(new Seat[] {
                new Seat(1, "A"),
                new Seat(1, "B"),
                new Seat(1, "C"),
                new Seat(1, "D")
        });
    }
}
