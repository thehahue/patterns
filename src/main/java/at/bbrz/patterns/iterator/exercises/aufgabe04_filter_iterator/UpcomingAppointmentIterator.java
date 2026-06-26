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
        // TODO: Gib zurueck, ob bereits ein passender Termin vorbereitet ist.
        throw new UnsupportedOperationException("TODO: hasNext implementieren");
    }

    @Override
    public Appointment next() {
        // TODO: Wenn hasNext() false ist, wirf eine NoSuchElementException.
        // TODO: Merke den vorbereiteten Termin, suche den naechsten und gib den gemerkten Termin zurueck.
        throw new UnsupportedOperationException("TODO: next implementieren");
    }

    private void advance() {
        nextAppointment = null;

        // TODO: Lies aus source, bis ein nicht abgesagter Termin ab startDate gefunden wurde.
    }
}
