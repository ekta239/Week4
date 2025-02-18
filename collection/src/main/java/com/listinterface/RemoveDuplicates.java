package com.listinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    // Method to remove duplicates while preserving the order of elements
    public static List<Integer> removeDuplicates(List<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        // Loop through the list
        for (Integer element : list) {
            if (!seen.contains(element)) {
                seen.add(element);
                resultList.add(element);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        // Example input
        List<Integer> inputList = List.of(3, 1, 2, 2, 3, 4);

        // Call the method and print the result
        List<Integer> result = removeDuplicates(inputList);
        System.out.println(result);  // Expected: [3, 1, 2, 4]
    }
}
