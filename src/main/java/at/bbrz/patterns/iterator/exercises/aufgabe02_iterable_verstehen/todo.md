# Aufgabe 02: Eine eigene Klasse Iterable machen

## Ziel

Du machst eine eigene Sammlung mit der Enhanced-for-Schleife verwendbar.

## Ausgangspunkt

`ReadingList` speichert mehrere `Book`-Objekte intern in einer `List`.

## Aufgaben

1. Implementiere `iterator()` in `ReadingList`.
2. Gib einen Iterator ueber die interne Buecherliste zurueck.
3. Pruefe mit `ReadingListDemo`, ob die Enhanced-for-Schleife funktioniert.

## Beispiel

Nach der Implementierung soll dieser Code funktionieren:

```java
for (Book book : readingList) {
    System.out.println(book.title());
}
```

## Zusatzfrage

Warum muss `ReadingList` nicht selbst wissen, wie eine `ArrayList` intern aufgebaut ist?
