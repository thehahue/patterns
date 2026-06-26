package at.bbrz.patterns.iterator.exercises.aufgabe04_filter_iterator;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class UpcomingAppointmentIterator implements Iterator<Appointment> {
    private final Iterator<Appointment> source;
    private final LocalDate startDate;
    private Appointment nextAppointment;

    public UpcomingAppointmentIterator(Iterator<Appointment> source, LocalDate startDate) {
        this.source = Objects.requireNonNull(source);
        this.startDate = Objects.requireNonNull(startDate);
        advance();
    }

    @Override
    public boolean hasNext() {
        return nextAppointment != null;
    }

    @Override
    public Appointment next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Appointment result = nextAppointment;
        advance();
        return result;
    }

    private void advance() {
        nextAppointment = null;

        while (source.hasNext() && nextAppointment == null) {
            Appointment candidate = source.next();
            if (!candidate.cancelled() && candidate.isOnOrAfter(startDate)) {
                nextAppointment = candidate;
            }
        }
    }
}
