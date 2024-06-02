package com.sushobhan.package1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicateWordsInAString {
    public static void main(String[] args) {
        String text = "Big black bug bit a big black dog on his big black nose";
        String[] sList = text.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String s : sList) {
            map.put(s, s.length());
        }
        System.out.println(map);
        List<String> duplicateWords = map.entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(duplicateWords);
    }
}
