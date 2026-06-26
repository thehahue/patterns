package at.bbrz.patterns.iterator.exercises.aufgabe04_filter_iterator;

import java.time.LocalDate;

public record Appointment(String title, LocalDate date, boolean cancelled) {
    public boolean isOnOrAfter(LocalDate startDate) {
        return !date.isBefore(startDate);
    }
}
