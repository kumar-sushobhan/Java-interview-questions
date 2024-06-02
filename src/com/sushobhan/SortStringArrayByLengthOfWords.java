package com.sushobhan;

import java.util.*;
import java.util.stream.Collectors;

public class SortStringArrayByLengthOfWords {
    public static void main(String[] args) {
        String text = "Java is a object oriented language and it's tough";
        String[] s = text.split(" ");

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String s1 : s) {
            wordsMap.put(s1, s1.length());
        }
        //System.out.println(wordsMap);
        LinkedHashMap<Integer, List<String>> map = wordsMap.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        LinkedHashMap::new,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println(map);
        List<String> sortedWordList = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .toList();
        String sortedText = sortedWordList.stream()
                .collect(Collectors.joining(" "));
        System.out.println("sorted text based on decreasing order : " + sortedText);
    }
}
