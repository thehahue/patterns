package at.bbrz.patterns.iterator.exercises.aufgabe05_tree_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class Folder implements Iterable<FileEntry> {
    private final String name;
    private final List<FileEntry> files = new ArrayList<>();
    private final List<Folder> folders = new ArrayList<>();

    public Folder(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public Folder addFile(String path) {
        files.add(new FileEntry(path));
        return this;
    }

    public Folder addFolder(Folder folder) {
        folders.add(Objects.requireNonNull(folder));
        return this;
    }

    public String name() {
        return name;
    }

    public List<FileEntry> files() {
        return Collections.unmodifiableList(files);
    }

    public List<Folder> folders() {
        return Collections.unmodifiableList(folders);
    }

    @Override
    public Iterator<FileEntry> iterator() {
        return new FolderFileIterator(this);
    }

    public static Folder sampleProject() {
        Folder main = new Folder("main")
                .addFile("src/main/java/App.java");

        Folder test = new Folder("test")
                .addFile("src/test/java/AppTest.java");

        Folder src = new Folder("src")
                .addFolder(main)
                .addFolder(test);

        Folder docs = new Folder("docs")
                .addFile("docs/iterator-notes.md");

        return new Folder("project")
                .addFile("README.md")
                .addFile("pom.xml")
                .addFolder(src)
                .addFolder(docs);
    }
}
