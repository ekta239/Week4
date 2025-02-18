package com.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        // Test case for ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Test case for LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("\nOriginal LinkedList: " + linkedList);
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    // Method to reverse a List without using built-in reverse methods
    public static void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        // Use a simple two-pointer approach to reverse the list
        while (left < right) {
            // Swap the elements at left and right indices
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
