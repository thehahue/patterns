package at.bbrz.patterns.iterator.exercises.aufgabe04_filter_iterator;

import java.time.LocalDate;
import java.util.Iterator;

public final class TrainingCalendarDemo {
    private TrainingCalendarDemo() {
    }

    public static void main(String[] args) {
        Iterator<Appointment> appointments = TrainingCalendar.sample()
                .upcomingIterator(LocalDate.of(2026, 1, 10));

        while (appointments.hasNext()) {
            Appointment appointment = appointments.next();
            System.out.println(appointment.date() + ": " + appointment.title());
        }
    }
}
