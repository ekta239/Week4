package com.mapinterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaxKey {
    public static String findMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        System.out.println(findMaxKey(map)); // Output: B
    }
}
