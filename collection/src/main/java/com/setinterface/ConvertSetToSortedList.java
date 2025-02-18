package com.setinterface;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConvertSetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        return new TreeSet<>(set).stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(5, 3, 9, 1);
        System.out.println(convertToSortedList(numbers)); // Output: [1, 3, 5, 9]
    }
}
