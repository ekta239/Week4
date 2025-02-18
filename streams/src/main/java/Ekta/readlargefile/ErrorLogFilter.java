package Ekta.readlargefile;

import java.io.*;

public class ErrorLogFilter {
    // Method to read a file and print lines containing "error"
    public static void filterErrorLines(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "output.txt";  // Replace with your actual file path
        filterErrorLines(filePath);
    }
}
