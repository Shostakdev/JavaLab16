package com.labwork6;

import java.util.ArrayList;
import java.util.List;

/**
 * A directory is a composite component that can contain other components.
 */
class Directory extends FileSystemComponent {
    /**
     * The list of children components.
     */
    private List<FileSystemComponent> children = new ArrayList<>();

    /**
     * Constructor.
     * @param name The name of the directory.
     */
    public Directory(String name) {
        super(name);
    }

    /**
     * Add a component to the directory.
     * @param component The component to add.
     */
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void print() {
        System.out.println("Directory: " + getName());
        for (FileSystemComponent component : children) {
            component.print();
        }
    }

    @Override
    public FileSystemComponent clone(int depth) {
        Directory clonedDirectory = new Directory(this.name);
        if (depth > 0) {
            for (FileSystemComponent child : children) {
                clonedDirectory.add(child.clone(depth - 1));
            }
        }
        return clonedDirectory;
    }
}
