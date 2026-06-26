package at.bbrz.patterns.iterator.exercises.aufgabe03_array_iterator;

public record Seat(int row, String label) {
    @Override
    public String toString() {
        return row + label;
    }
}
