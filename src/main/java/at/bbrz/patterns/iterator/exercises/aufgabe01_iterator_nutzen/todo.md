# Aufgabe 01: Iterator explizit nutzen

## Ziel

Du verwendest einen vorhandenen `Iterator`, ohne eine `for`- oder `for-each`-Schleife zu benutzen.

## Ausgangspunkt

Die Klasse `WordCollector` enthaelt eine Methode mit `TODO`.

## Aufgaben

1. Erzeuge aus der uebergebenen Liste einen `Iterator<String>`.
2. Durchlaufe den Iterator mit `hasNext()` und `next()`.
3. Fuege jedes Wort in Grossbuchstaben zur Ergebnisliste hinzu.
4. Entferne die `UnsupportedOperationException`.

## Beispiel

Eingabe:

```java
List.of("java", "iterator", "pattern")
```

Erwartetes Ergebnis:

```java
List.of("JAVA", "ITERATOR", "PATTERN")
```

## Regeln

- Verwende keine `for`-Schleife.
- Verwende keine `for-each`-Schleife.
- Verwende keinen Stream.
