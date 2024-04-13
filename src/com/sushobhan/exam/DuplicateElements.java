package com.sushobhan.exam;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] a = {2,4,3,5,7,2,9,3,5};
        System.out.println("Duplicate numbers : " + findDuplicates(a));
    }

    private static List<Integer> findDuplicates(int[] numbers) {
        LinkedHashMap<Integer, Long> numberFrequency = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()));
        return numberFrequency.entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
    }
}
