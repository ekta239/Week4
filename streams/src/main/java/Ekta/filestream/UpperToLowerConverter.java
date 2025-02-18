package Ekta.filestream;

import java.io.*;

public class UpperToLowerConverter {
    // Method to convert uppercase to lowercase and write to a new file
    public static void convertFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion completed: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFile = "destination.txt";  // Replace with your input file
        String outputFile = "output.txt"; // Replace with your output file
        convertFile(inputFile, outputFile);
    }
}
