package com.regex;

import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE).matcher(text);
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        return repeatingWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Set<String> repeatingWords = findRepeatingWords(text);
        System.out.println("Repeating Words: " + repeatingWords);
    }
}
