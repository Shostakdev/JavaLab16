package com.labwork6;

/**
 * The main class.
 */
public class Main {
    /**
     * The main method.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create files
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // Create directories and add files to them
        Directory dir1 = new Directory("Dir1");
        dir1.add(file1);

        Directory dir2 = new Directory("Dir2");
        dir2.add(file2);
        dir2.add(file3);

        // Create root directory and add subdirectories to it
        Directory rootDir = new Directory("Root");
        rootDir.add(dir1);
        rootDir.add(dir2);

        // Print the original file system
        System.out.println("Original File System:");
        rootDir.print();

        // Clone the file system with depth 1
        Directory clonedRootDir = (Directory) rootDir.clone(1);
        System.out.println("\nCloned File System with Depth 1:");
        clonedRootDir.print();
    }
}