package at.bbrz.patterns.iterator.exercises.aufgabe05_tree_iterator;

public final class FolderDemo {
    private FolderDemo() {
    }

    public static void main(String[] args) {
        for (FileEntry file : Folder.sampleProject()) {
            System.out.println(file);
        }
    }
}
