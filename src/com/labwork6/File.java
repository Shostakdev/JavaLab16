package com.labwork6;

/**
 * A file is a leaf node in the file system tree.
 */
class File extends FileSystemComponent {
    /**
     * Constructor.
     * @param name The name of the file.
     */
    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("File: " + getName());
    }

    @Override
    public FileSystemComponent clone(int depth) {
        // A file is a leaf node, cloning a file means creating a new instance with the same name.
        return new File(this.name);
    }
}
