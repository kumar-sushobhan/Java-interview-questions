package com.sushobhan.package1;

import java.util.ArrayList;
import java.util.List;

public class SwapLetters2AtATime {
    public static void main(String[] args) {
        String text = "abmnxy"; //banmyx //01234
        swap2Letters(text);
    }

    static void swap2Letters(String text) {
        String[] sList = text.split("");
        List<String> s1 = new ArrayList<>();
        for (int i = 0; i < sList.length; i = i + 2) {
            String s2 = text.substring(i, i + 2);
            s1.add(swap(s2));
        }
        s1.forEach(System.out::printf);
    }

    private static String swap(String s3) {
        return new StringBuilder(s3).reverse().toString();
    }
}
