package com.sushobhan;

import java.util.*;
import java.util.stream.Collectors;

public class FindLongestStringFromGivenArray {
    public static void main(String[] args) {
        String[] strArray = {"java", "sushobhan", "microservices", "kafka", "testng"};
        System.out.println("Longest string is : " + longestString(strArray));
        sortSentenceByLength(strArray);
    }

    private static String longestString(String[] strArray) {
        return Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
    }

    private static void sortSentenceByLength(String[] strArray) {

        LinkedHashMap<String, Long> map = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
        Map<String, Integer> map2 = new HashMap<>();
        for (String s : strArray) {
            map2.put(s, s.length());
        }
        List<String> sortedKey = map2.entrySet()
                .stream()
                //.sorted(Comparator.comparing(Map.Entry::getValue))
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)))
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(sortedKey);

        System.out.println(map2);
        Optional<String> secondHighestKey = map2.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst();
        System.out.println(secondHighestKey.get());
    }
}
