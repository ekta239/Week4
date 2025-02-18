package Ekta.countwords;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    // Method to count word occurrences in a file
    public static Map<String, Integer> countWordOccurrences(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Normalize text: Convert to lowercase and remove punctuation
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return wordCount;
    }

    // Method to find and display the top 5 most frequent words
    public static void displayTopWords(Map<String, Integer> wordCount) {
        System.out.println("Top 5 Most Frequent Words:");
        wordCount.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // Sort by frequency (descending)
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void main(String[] args) {
        String filePath = "output.txt"; // Replace with the actual file path
        Map<String, Integer> wordCount = countWordOccurrences(filePath);
        displayTopWords(wordCount);
    }
}
