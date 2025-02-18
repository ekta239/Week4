package com.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListRotator {

    // Method to rotate the list by a given number of positions
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        
        // If the list is empty or positions is 0, return the original list
        if (size == 0 || positions == 0) {
            return list;
        }
        
        // Normalize the number of positions (handle cases where positions > size)
        positions = positions % size;
        
        // Split the list into two parts and concatenate them in rotated order
        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(positions, size));  // Second part
        rotatedList.addAll(list.subList(0, positions));  // First part

        return rotatedList;
    }

    public static void main(String[] args) {
        // Example input
        List<Integer> inputList = List.of(10, 20, 30, 40, 50);
        int positions = 2;

        // Call the method and print the result
        List<Integer> result = rotateList(inputList, positions);
        System.out.println(result);  // Expected: [30, 40, 50, 10, 20]
    }
}
