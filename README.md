# Iterator Pattern Examples

Maven-Projekt mit Java 21, das das Iterator Pattern anhand eigener Iteratoren und anhand der Java-Standardbibliothek zeigt.

Grundlage: Refactoring Guru beschreibt den Iterator als Verhaltensmuster, mit dem Elemente einer Sammlung durchlaufen werden koennen, ohne die interne Darstellung der Sammlung offenzulegen: <https://refactoring.guru/design-patterns/iterator>

## Starten

```bash
mvn test
mvn exec:java
```

## Beispiele

- `custom`: Eigene Kursstruktur mit mehreren Iteratoren:
  - `DepthFirstModuleIterator`
  - `BreadthFirstModuleIterator`
  - `LeafLessonIterator`
- `javaapi`: Beispiele, in denen Java das Iterator-Konzept bereits verwendet:
  - `Iterator` aus `Collection`
  - `Iterable` und Enhanced-for-Schleife
  - `ListIterator` fuer Vor- und Rueckwaertsbewegung
  - `Scanner` als Iterator ueber Tokens
  - `Spliterator` als Iterator-nahe Basis fuer Streams und Aufteilung
- `exercises`: Uebungsaufgaben fuer Schueler:
  - `aufgabe01_iterator_nutzen`: vorhandenen Iterator mit `hasNext()` und `next()` verwenden
  - `aufgabe02_iterable_verstehen`: eigene Klasse mit `Iterable` fuer Enhanced-for vorbereiten
  - `aufgabe03_array_iterator`: eigenen Iterator fuer ein Array schreiben
  - `aufgabe04_filter_iterator`: Iterator mit Filterlogik und Lookahead schreiben
  - `aufgabe05_tree_iterator`: Iterator fuer eine Baumstruktur in Tiefensuche schreiben

## Kerngedanke

Die Sammlung liefert Iteratoren aus, der Client arbeitet nur mit dem Iterator-Vertrag. Dadurch koennen Traversierungsalgorithmen ausgetauscht werden, ohne Client-Code oder Speicherstruktur umzubauen.
