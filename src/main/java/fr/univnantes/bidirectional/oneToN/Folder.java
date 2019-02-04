package fr.univnantes.bidirectional.oneToN;

/**
 * Class representing a directory, for the example of a one-to-many bidirectional association.
 * A directory, or folder, has a reference to many files.
 *
 * @author Glenn Plouhinec
 * @version 0.1
 */
public class Folder {

    /**
     * The name of this folder.
     */
    private String name;

    /**
     * The reference to all the files of this folder.
     */
    private FolderReferenceToFiles files;

    /**
     * Constructor of Folder. Initializes properties of this class. Initializes the files reference with "this".
     * @param name the name of this folder.
     */
    public Folder(String name) {
        this.name = name;
        this.files = new FolderReferenceToFiles(this);
    }

    /**
     * Returns the files reference.
     * @return this.files.
     */
    public FolderReferenceToFiles getFiles() {
        return this.files;
    }

    /**
     * Add a new file for this folder, using the files reference.
     * @param file the new file to add.
     */
    public void addFile(File file) {
        this.files.add(file);
    }

    /**
     * Removes the reference to a file.
     * @param file the file (reference) to remove.
     */
    public void removeFile(File file) {
        this.files.remove(file);
    }
}
