package Ekta.userinputfromconsole;

import java.io.*;

public class UserInputToFile {
    private static final String FILE_NAME = "user_data.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(FILE_NAME, true)) { // Append mode

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            String userData = "Name: " + name + ", Age: " + age + ", Language: " + language + "\n";
            writer.write(userData);

            System.out.println("Data saved to " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Please enter a number.");
        }
    }
}
