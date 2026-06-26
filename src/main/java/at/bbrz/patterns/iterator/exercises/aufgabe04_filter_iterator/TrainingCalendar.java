package at.bbrz.patterns.iterator.exercises.aufgabe04_filter_iterator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class TrainingCalendar {
    private final List<Appointment> appointments = new ArrayList<>();

    public TrainingCalendar add(Appointment appointment) {
        appointments.add(Objects.requireNonNull(appointment));
        return this;
    }

    public Iterator<Appointment> upcomingIterator(LocalDate startDate) {
        return new UpcomingAppointmentIterator(appointments.iterator(), startDate);
    }

    public static TrainingCalendar sample() {
        return new TrainingCalendar()
                .add(new Appointment("Altes Planungstreffen", LocalDate.of(2026, 1, 3), false))
                .add(new Appointment("Iterator Workshop", LocalDate.of(2026, 1, 10), false))
                .add(new Appointment("Abgesagte Code Review", LocalDate.of(2026, 1, 11), true))
                .add(new Appointment("Projektpraesentation", LocalDate.of(2026, 1, 17), false));
    }
}
