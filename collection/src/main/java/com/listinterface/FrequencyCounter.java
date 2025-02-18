package com.listinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    // Method to find the frequency of elements in a list
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterate through the list and count frequency of each element
        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        // Example input
        List<String> inputList = List.of("apple", "banana", "apple", "orange");

        // Call the method and print the result
        Map<String, Integer> result = countFrequency(inputList);
        System.out.println(result);  // Expected: {apple=2, banana=1, orange=1}
    }
}
