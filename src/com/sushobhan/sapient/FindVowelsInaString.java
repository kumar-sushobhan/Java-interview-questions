package com.sushobhan.sapient;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindVowelsInaString {
    public static void main(String[] args) {
        String text = "MISBEHAVIOUR";
        System.out.println("Vowels occurrence : " + findOccurrenceOfVowels(text));
    }

    private static Map<Character, Integer> findOccurrenceOfVowels(String text) {
        String text1 = text.toUpperCase();
        Map<Character, Integer> vowelsMap = new LinkedHashMap<>();
        vowelsMap.put('A', 0);
        vowelsMap.put('E', 0);
        vowelsMap.put('I', 0);
        vowelsMap.put('O', 0);
        vowelsMap.put('U', 0);

        for (int i = 0; i < text1.length() - 1; i++) {
            if (vowelsMap.containsKey(text1.charAt(i)) && text1.charAt(i)=='A') {
                int count = vowelsMap.get(text1.charAt(i));
                vowelsMap.put('A', ++count);
            } else if (vowelsMap.containsKey(text1.charAt(i)) && text1.charAt(i)=='E') {
                int count = vowelsMap.get(text1.charAt(i));
                vowelsMap.put('E', ++count);
            } else if (vowelsMap.containsKey(text1.charAt(i)) && text1.charAt(i)=='I') {
                int count = vowelsMap.get(text1.charAt(i));
                vowelsMap.put('I', ++count);
            } else if (vowelsMap.containsKey(text1.charAt(i)) && text1.charAt(i)=='O') {
                int count = vowelsMap.get(text1.charAt(i));
                vowelsMap.put('O', ++count);
            } else if (vowelsMap.containsKey(text1.charAt(i)) && text1.charAt(i)=='U') {
                int count = vowelsMap.get(text1.charAt(i));
                vowelsMap.put('U', ++count);
            }
        }
        return vowelsMap;
    }
}
