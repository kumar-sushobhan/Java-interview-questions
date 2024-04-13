package com.sushobhan;

import java.util.*;
import java.util.stream.Collectors;

public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        //countOccurrences(new int[]{2, 5, 6, 7, 4, 3, 5, 4, 2, 4});
        System.out.println(countOccurrenceByJava8(new int[]{2, 5, 6, 7, 4, 3, 5, 4, 2, 4}));
        System.out.println(countDuplicateOccurrenceByJava8(new int[]{2, 5, 6, 7, 4, 3, 5, 4, 2, 4}));
        System.out.println(firstNonRepeatativeOccurrenceByJava8(new int[]{2, 5, 6, 7, 4, 3, 5, 4, 2, 4}));
    }

    static void countOccurrences(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        System.out.println("Map presentation : " + map);
    }

    static Map<Integer, Long> countOccurrenceByJava8(int[] a) {
        return Arrays.stream(a)
                .boxed()
                //.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));
    }

    static List<Integer> countDuplicateOccurrenceByJava8(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    static Integer firstNonRepeatativeOccurrenceByJava8(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(t -> t, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow();
    }
}
