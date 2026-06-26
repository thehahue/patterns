# Aufgabe 05: Iterator fuer eine Baumstruktur schreiben

## Ziel

Du implementierst einen eigenen Iterator fuer eine verschachtelte Struktur.

## Ausgangspunkt

Ein `Folder` kann Dateien und weitere Ordner enthalten. Die Datenklassen und Beispieldaten sind vorgegeben.

Der Iterator `FolderFileIterator` soll alle Dateien in Tiefensuche liefern:

1. Dateien des aktuellen Ordners
2. Danach Dateien der Unterordner von links nach rechts

## Aufgaben

1. Entscheide, welche Informationen der Iterator als Zustand speichern muss.
2. Implementiere den Konstruktor.
3. Implementiere `hasNext()`.
4. Implementiere `next()` mit `NoSuchElementException`, wenn es kein weiteres Element gibt.
5. Stelle sicher, dass Unterordner in der Reihenfolge durchlaufen werden, in der sie in `Folder` eingefuegt wurden.

## Erwartete Reihenfolge

Bei `Folder.sampleProject()` sollen die Dateien so geliefert werden:

```text
README.md
pom.xml
src/main/java/App.java
src/test/java/AppTest.java
docs/iterator-notes.md
```

## Hinweis

Eine Tiefensuche laesst sich gut mit einem `Deque` als Stack loesen. Wenn du Unterordner auf einen Stack legst, musst du sie eventuell rueckwaerts einfuegen, damit die Reihenfolge stimmt.
