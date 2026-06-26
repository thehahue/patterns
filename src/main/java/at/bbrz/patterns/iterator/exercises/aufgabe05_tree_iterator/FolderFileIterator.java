package at.bbrz.patterns.iterator.exercises.aufgabe05_tree_iterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class FolderFileIterator implements Iterator<FileEntry> {
    private final Deque<FolderState> stack = new ArrayDeque<>();

    public FolderFileIterator(Folder root) {
        stack.push(new FolderState(Objects.requireNonNull(root)));
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty() && !stack.peek().hasNextFile()) {
            FolderState current = stack.pop();
            for (int i = current.folder.folders().size() - 1; i >= 0; i--) {
                stack.push(new FolderState(current.folder.folders().get(i)));
            }
        }

        return !stack.isEmpty();
    }

    @Override
    public FileEntry next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return stack.peek().nextFile();
    }

    private static final class FolderState {
        private final Folder folder;
        private int fileIndex;

        private FolderState(Folder folder) {
            this.folder = folder;
        }

        private boolean hasNextFile() {
            return fileIndex < folder.files().size();
        }

        private FileEntry nextFile() {
            return folder.files().get(fileIndex++);
        }
    }
}
