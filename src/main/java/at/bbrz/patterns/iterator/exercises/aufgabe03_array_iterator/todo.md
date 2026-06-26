# Aufgabe 03: Eigenen Iterator fuer ein Array schreiben

## Ziel

Du implementierst einen Iterator, der ueber ein Array laeuft.

## Ausgangspunkt

`SeatRow` stellt eine Reihe von Sitzplaetzen bereit. Die Datenklasse `Seat` und die Sammlung `SeatRow` sind vorgegeben.

## Aufgaben

1. Ergaenze in `SeatRowIterator` ein Feld fuer die aktuelle Position.
2. Implementiere `hasNext()`.
3. Implementiere `next()`.
4. Wirf in `next()` eine `NoSuchElementException`, wenn kein weiteres Element vorhanden ist.
5. Entferne die `UnsupportedOperationException`.

## Erwartete Reihenfolge

Bei `SeatRow.sample()` soll die Iteration diese Plaetze liefern:

```text
1A, 1B, 1C, 1D
```

## Hinweis

`next()` soll das aktuelle Element zurueckgeben und danach die Position erhoehen.
