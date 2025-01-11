import java.io.*;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "example.txt";

        try {
            // Write to the file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a file handling example.\n");
            writer.write("You can read, write, and modify files with Java.");
            writer.close();
            System.out.println("File written successfully.");

            // Read from the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Modify the file
            System.out.println("\nEnter new content to add to the file:");
            String newContent = scanner.nextLine();
            writer = new FileWriter(fileName, true);
            writer.write("\n" + newContent);
            writer.close();
            System.out.println("File updated successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        scanner.close();
    }
}
