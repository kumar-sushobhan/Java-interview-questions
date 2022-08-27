package com.sushobhan;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("sushobhan"));
        System.out.println(stringContainsVowels("kumar"));
    }

    static boolean stringContainsVowels(String text) {
        return text.toLowerCase().matches(".*[aeiou].*");
    }
}
