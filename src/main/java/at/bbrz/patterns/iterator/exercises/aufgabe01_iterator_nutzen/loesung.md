# Loesung: Iterator explizit nutzen

## Grundidee

In dieser Aufgabe gibt es bereits eine `List<String>`. Eine Liste kann in Java einen Iterator erzeugen:

```java
Iterator<String> iterator = words.iterator();
```

Der Iterator ist ein Objekt, das Schritt fuer Schritt durch die Liste geht. Der Code muss dadurch nicht wissen, wie die Liste intern aufgebaut ist.

## Die zwei wichtigsten Methoden

Ein Iterator wird normalerweise mit zwei Methoden verwendet:

```java
iterator.hasNext()
iterator.next()
```

`hasNext()` fragt:

> Gibt es noch ein weiteres Element?

`next()` sagt:

> Gib mir das naechste Element und gehe danach einen Schritt weiter.

Darum sieht die typische Schleife so aus:

```java
while (iterator.hasNext()) {
    String word = iterator.next();
}
```

Die Schleife laeuft so lange, bis der Iterator kein weiteres Element mehr hat.

## Die konkrete Loesung

Die Methode `collectUppercase(...)` erstellt zuerst eine leere Ergebnisliste:

```java
List<String> result = new ArrayList<>();
```

Danach wird der Iterator der uebergebenen Liste erzeugt:

```java
Iterator<String> iterator = words.iterator();
```

Dann wird jedes Wort gelesen, in Grossbuchstaben umgewandelt und in die Ergebnisliste eingefuegt:

```java
while (iterator.hasNext()) {
    result.add(iterator.next().toUpperCase());
}
```

Am Ende wird die Ergebnisliste zurueckgegeben:

```java
return result;
```

## Ablauf am Beispiel

Eingabe:

```java
List.of("java", "iterator", "pattern")
```

Der Iterator liefert nacheinander:

```text
java
iterator
pattern
```

Die Methode wandelt jedes Wort um:

```text
JAVA
ITERATOR
PATTERN
```

Das Ergebnis ist:

```java
List.of("JAVA", "ITERATOR", "PATTERN")
```

## Warum keine for-Schleife?

Die Aufgabe soll sichtbar machen, was hinter einer `for-each`-Schleife steckt.

Dieser Code:

```java
for (String word : words) {
    result.add(word.toUpperCase());
}
```

verwendet intern ebenfalls einen Iterator. In dieser Aufgabe wird dieser Mechanismus nur explizit ausgeschrieben.

## Zusammenfassung

Die Loesung besteht aus drei Schritten:

1. Iterator aus der Liste holen.
2. Mit `hasNext()` pruefen, ob noch ein Element vorhanden ist.
3. Mit `next()` das naechste Element holen und verarbeiten.

Der Iterator kapselt die Traversierung der Liste. Der eigene Code muss nur den Iterator-Vertrag verwenden.
