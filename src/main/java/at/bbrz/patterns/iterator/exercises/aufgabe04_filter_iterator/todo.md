# Aufgabe 04: Filternden Iterator schreiben

## Ziel

Du implementierst einen Iterator, der nur passende Elemente liefert.

## Ausgangspunkt

`TrainingCalendar` enthaelt Termine. `upcomingIterator(...)` soll nur Termine liefern, die:

- nicht abgesagt sind
- am Startdatum oder danach liegen

Die Datenklassen sind bereits vorgegeben.

## Aufgaben

1. Implementiere in `UpcomingAppointmentIterator` die Methode `advance()`.
2. `advance()` soll so lange lesen, bis ein passender Termin gefunden wurde oder die Quelle leer ist.
3. Implementiere `hasNext()`.
4. Implementiere `next()` mit `NoSuchElementException`, wenn es kein weiteres Element gibt.
5. Nach jedem `next()` muss der Iterator den naechsten passenden Termin vorbereiten.

## Erwartetes Ergebnis

Bei `TrainingCalendar.sample().upcomingIterator(LocalDate.of(2026, 1, 10))` sollen diese Termine geliefert werden:

```text
Iterator Workshop
Projektpraesentation
```

## Hinweis

Diese Aufgabe braucht ein Feld fuer das bereits gefundene naechste Element.
