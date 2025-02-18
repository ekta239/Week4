package com.regex;

import java.util.regex.*;
import java.util.*;

public class ExtractCapitalizedWords {
    public static List<String> extractCapitalizedWords(String text) {
        List<String> capitalizedWords = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = extractCapitalizedWords(text);
        System.out.println("Capitalized Words: " + words);
    }
}
