package at.bbrz.patterns.iterator.exercises.aufgabe03_array_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class SeatRowIterator implements Iterator<Seat> {
    private final Seat[] seats;
    private int position;

    public SeatRowIterator(Seat[] seats) {
        this.seats = seats;
    }

    @Override
    public boolean hasNext() {
        return position < seats.length;
    }

    @Override
    public Seat next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return seats[position++];
    }
}
