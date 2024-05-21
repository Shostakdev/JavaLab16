package com.labwork6;

/**
 * A file system component is a component in the file system tree.
 */
abstract class FileSystemComponent implements Cloneable {
    /**
     * The name of the component.
     */
    protected String name;

    /**
     * Constructor.
     * @param name The name of the component.
     */
    public FileSystemComponent(String name) {
        this.name = name;
    }

    /**
     * Print the component.
     */
    public abstract void print();

    /**
     * Get the name of the component.
     * @return The name of the component.
     */
    public String getName() {
        return name;
    }

    /**
     * Clone the component.
     * @param depth The depth of the clone.
     * @return The cloned component.
     */
    public abstract FileSystemComponent clone(int depth);
}
