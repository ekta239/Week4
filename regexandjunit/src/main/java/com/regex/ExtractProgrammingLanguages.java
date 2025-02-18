package com.regex;
import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguages {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go|C|C\\+\\+|Ruby|Swift|Kotlin|PHP|R)\\b").matcher(text);
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = extractLanguages(text);
        System.out.println("Extracted Languages: " + languages);
    }
}
