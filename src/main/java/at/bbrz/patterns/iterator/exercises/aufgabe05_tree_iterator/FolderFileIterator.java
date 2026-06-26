package at.bbrz.patterns.iterator.exercises.aufgabe05_tree_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class FolderFileIterator implements Iterator<FileEntry> {
    public FolderFileIterator(Folder root) {
        // TODO: Initialisiere den Iterator-Zustand mit dem Wurzelordner.
    }

    @Override
    public boolean hasNext() {
        // TODO: Gib zurueck, ob noch eine Datei vorhanden ist.
        throw new UnsupportedOperationException("TODO: hasNext implementieren");
    }

    @Override
    public FileEntry next() {
        // TODO: Wenn hasNext() false ist, wirf eine NoSuchElementException.
        // TODO: Gib die naechste Datei in Tiefensuche zurueck.
        throw new UnsupportedOperationException("TODO: next implementieren");
    }
}
