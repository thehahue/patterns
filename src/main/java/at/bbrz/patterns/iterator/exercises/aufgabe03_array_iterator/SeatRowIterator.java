package at.bbrz.patterns.iterator.exercises.aufgabe03_array_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class SeatRowIterator implements Iterator<Seat> {
    private final Seat[] seats;

    public SeatRowIterator(Seat[] seats) {
        this.seats = seats;
    }

    @Override
    public boolean hasNext() {
        // TODO: Pruefe, ob die aktuelle Position noch innerhalb des Arrays liegt.
        throw new UnsupportedOperationException("TODO: hasNext implementieren");
    }

    @Override
    public Seat next() {
        // TODO: Wenn hasNext() false ist, wirf eine NoSuchElementException.
        // TODO: Gib den aktuellen Sitzplatz zurueck und erhoehe die Position.
        throw new UnsupportedOperationException("TODO: next implementieren");
    }
}
