package tree.directory;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter path: ");
        Scanner scanner = new Scanner(System.in);
        String inputPath = scanner.nextLine();

        File directory = new File(inputPath);

        printDirectoryTree(directory, "");
    }

    public static void printDirectoryTree(File directory, String indent) {
        System.out.println(indent + directory.getName());

        File[] files = directory.listFiles();

        if (files == null) {
            return;
        }

        indent += "     ";

        for (File file : files) {
            if (file.isDirectory()) {
                printDirectoryTree(file, indent);
            }
        }
    }

}